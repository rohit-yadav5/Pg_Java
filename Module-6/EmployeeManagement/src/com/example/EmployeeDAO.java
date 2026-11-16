package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {

    // Database configuration
    private static final String URL = "jdbc:mysql://localhost:3306/company_db?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = ""; // Update as per local MySQL environment

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("MySQL JDBC Driver not found in classpath: " + e.getMessage());
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    /**
     * Inserts a new employee record into MySQL table employees.
     */
    public boolean insertEmployee(int empId, String name, String department, double salary) throws SQLException {
        String sql = "INSERT INTO employees (emp_id, name, department, salary) VALUES (?, ?, ?, ?)";
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, empId);
            pstmt.setString(2, name);
            pstmt.setString(3, department);
            pstmt.setDouble(4, salary);

            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;
        }
    }

    /**
     * Retrieves all employees from MySQL database.
     */
    public List<Employee> getAllEmployees() throws SQLException {
        List<Employee> list = new ArrayList<>();
        String sql = "SELECT emp_id, name, department, salary FROM employees ORDER BY emp_id ASC";

        try (Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                int id = rs.getInt("emp_id");
                String name = rs.getString("name");
                String department = rs.getString("department");
                double salary = rs.getDouble("salary");

                list.add(new Employee(id, name, department, salary));
            }
        }
        return list;
    }

    /**
     * Model class representing an Employee record.
     */
    public static class Employee {
        private int empId;
        private String name;
        private String department;
        private double salary;

        public Employee(int empId, String name, String department, double salary) {
            this.empId = empId;
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        public int getEmpId() { return empId; }
        public String getName() { return name; }
        public String getDepartment() { return department; }
        public double getSalary() { return salary; }
    }
}
