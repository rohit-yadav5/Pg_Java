package com.example;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;

public class EmployeeForm extends JFrame implements ActionListener {

    private JTextField txtEmpId;
    private JTextField txtName;
    private JTextField txtDepartment;
    private JTextField txtSalary;

    private JButton btnSubmit;
    private JButton btnViewAll;
    private JButton btnClear;

    private JTable employeeTable;
    private DefaultTableModel tableModel;
    private JLabel statusLabel;

    private EmployeeDAO employeeDAO;

    public EmployeeForm() {
        super("Employee Management System - Swing & JDBC");
        employeeDAO = new EmployeeDAO();

        setLayout(new BorderLayout(10, 10));

        // --- Top Header ---
        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(new Color(24, 44, 97));
        JLabel headerLabel = new JLabel("Employee Management System");
        headerLabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
        headerLabel.setForeground(Color.WHITE);
        headerPanel.setBorder(BorderFactory.createEmptyBorder(12, 10, 12, 10));
        headerPanel.add(headerLabel);
        add(headerPanel, BorderLayout.NORTH);

        // --- Left: Form Input Panel ---
        JPanel formContainer = new JPanel(new BorderLayout(10, 10));
        formContainer.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createEmptyBorder(10, 15, 10, 10),
                BorderFactory.createTitledBorder("Add New Employee")
        ));

        JPanel formGrid = new JPanel(new GridLayout(4, 2, 8, 12));
        formGrid.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        formGrid.add(new JLabel("Employee ID (int):"));
        txtEmpId = new JTextField(15);
        formGrid.add(txtEmpId);

        formGrid.add(new JLabel("Name (text):"));
        txtName = new JTextField(15);
        formGrid.add(txtName);

        formGrid.add(new JLabel("Department (text):"));
        txtDepartment = new JTextField(15);
        formGrid.add(txtDepartment);

        formGrid.add(new JLabel("Salary (decimal):"));
        txtSalary = new JTextField(15);
        formGrid.add(txtSalary);

        formContainer.add(formGrid, BorderLayout.CENTER);

        // Form Buttons
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 8, 8));
        btnSubmit = new JButton("Submit");
        btnSubmit.setBackground(new Color(39, 174, 96));
        btnSubmit.setForeground(Color.WHITE);
        btnSubmit.setFocusPainted(false);
        btnSubmit.addActionListener(this);

        btnViewAll = new JButton("View All Employees");
        btnViewAll.setBackground(new Color(41, 128, 185));
        btnViewAll.setForeground(Color.WHITE);
        btnViewAll.setFocusPainted(false);
        btnViewAll.addActionListener(this);

        btnClear = new JButton("Clear");
        btnClear.setBackground(new Color(192, 57, 43));
        btnClear.setForeground(Color.WHITE);
        btnClear.setFocusPainted(false);
        btnClear.addActionListener(this);

        buttonPanel.add(btnSubmit);
        buttonPanel.add(btnViewAll);
        buttonPanel.add(btnClear);
        formContainer.add(buttonPanel, BorderLayout.SOUTH);

        add(formContainer, BorderLayout.WEST);

        // --- Center: Table Display Panel ---
        JPanel tablePanel = new JPanel(new BorderLayout(5, 5));
        tablePanel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createEmptyBorder(10, 5, 10, 15),
                BorderFactory.createTitledBorder("Registered Employees")
        ));

        String[] columnNames = {"Employee ID", "Name", "Department", "Salary (INR)"};
        tableModel = new DefaultTableModel(columnNames, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // read-only table
            }
        };

        employeeTable = new JTable(tableModel);
        employeeTable.setFillsViewportHeight(true);
        employeeTable.setRowHeight(24);
        employeeTable.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 13));

        JScrollPane scrollPane = new JScrollPane(employeeTable);
        tablePanel.add(scrollPane, BorderLayout.CENTER);

        add(tablePanel, BorderLayout.CENTER);

        // --- Bottom: Status Bar ---
        JPanel statusPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        statusPanel.setBorder(BorderFactory.createEtchedBorder());
        statusLabel = new JLabel("Ready. Connect to MySQL database 'company_db' to manage employees.");
        statusPanel.add(statusLabel);
        add(statusPanel, BorderLayout.SOUTH);

        setSize(860, 420);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSubmit) {
            handleFormSubmit();
        } else if (e.getSource() == btnViewAll) {
            loadAllEmployees();
        } else if (e.getSource() == btnClear) {
            clearFields();
            statusLabel.setText("Form cleared.");
        }
    }

    private void handleFormSubmit() {
        String idStr = txtEmpId.getText().trim();
        String name = txtName.getText().trim();
        String dept = txtDepartment.getText().trim();
        String salaryStr = txtSalary.getText().trim();

        if (idStr.isEmpty() || name.isEmpty() || dept.isEmpty() || salaryStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields.", "Validation Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int empId;
        double salary;

        try {
            empId = Integer.parseInt(idStr);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Employee ID must be a valid integer.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            salary = Double.parseDouble(salaryStr);
            if (salary < 0) throw new NumberFormatException();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Salary must be a positive decimal number.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            boolean success = employeeDAO.insertEmployee(empId, name, dept, salary);
            if (success) {
                JOptionPane.showMessageDialog(this, "Employee record added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                statusLabel.setText("Employee ID " + empId + " saved successfully.");
                clearFields();
                loadAllEmployees();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Database Error: " + ex.getMessage(), "JDBC Error", JOptionPane.ERROR_MESSAGE);
            statusLabel.setText("Error inserting employee: " + ex.getMessage());
        }
    }

    private void loadAllEmployees() {
        try {
            List<EmployeeDAO.Employee> employees = employeeDAO.getAllEmployees();
            tableModel.setRowCount(0); // clear existing rows

            for (EmployeeDAO.Employee emp : employees) {
                tableModel.addRow(new Object[]{
                        emp.getEmpId(),
                        emp.getName(),
                        emp.getDepartment(),
                        String.format("%.2f", emp.getSalary())
                });
            }

            statusLabel.setText("Loaded " + employees.size() + " employee record(s) from database.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Database Error while fetching records:\n" + ex.getMessage() +
                            "\n\nPlease ensure MySQL is running on localhost:3306 with database 'company_db'.",
                    "Connection / Query Error", JOptionPane.ERROR_MESSAGE);
            statusLabel.setText("Failed to load records: " + ex.getMessage());
        }
    }

    private void clearFields() {
        txtEmpId.setText("");
        txtName.setText("");
        txtDepartment.setText("");
        txtSalary.setText("");
        txtEmpId.requestFocus();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new EmployeeForm());
    }
}
