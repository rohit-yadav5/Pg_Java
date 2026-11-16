import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q7CalculatorForm extends JFrame implements ActionListener {

    private JTextField displayField;
    private double firstOperand = 0;
    private String operator = "";
    private boolean isOperatorClicked = false;
    private String fullExpression = "";

    public Q7CalculatorForm() {
        super("Calculator");

        setLayout(new BorderLayout(5, 5));
        getContentPane().setBackground(new Color(0, 0, 204));

        displayField = new JTextField();
        displayField.setFont(new Font("Arial", Font.BOLD, 18));
        displayField.setHorizontalAlignment(JTextField.RIGHT);
        displayField.setEditable(false);
        displayField.setBackground(Color.WHITE);
        displayField.setPreferredSize(new Dimension(220, 40));

        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 5, 10));
        topPanel.setBackground(new Color(0, 0, 204));
        topPanel.add(displayField, BorderLayout.CENTER);
        add(topPanel, BorderLayout.NORTH);

        JPanel gridPanel = new JPanel(new GridLayout(4, 4, 6, 6));
        gridPanel.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        gridPanel.setBackground(new Color(0, 0, 204));

        String[] buttonLabels = {
                "+", "1", "2", "3",
                "-", "4", "5", "6",
                "*", "7", "8", "9",
                "/", ".", "0", "C"
        };

        for (String label : buttonLabels) {
            JButton btn = new JButton(label);
            btn.setFont(new Font("Arial", Font.BOLD, 16));
            btn.setFocusPainted(false);
            btn.addActionListener(this);
            gridPanel.add(btn);
        }

        add(gridPanel, BorderLayout.CENTER);

        JPanel equalsPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        equalsPanel.setBorder(BorderFactory.createEmptyBorder(5, 10, 10, 10));
        equalsPanel.setBackground(new Color(0, 0, 204));
        JButton equalsButton = new JButton("=");
        equalsButton.setPreferredSize(new Dimension(80, 36));
        equalsButton.setFont(new Font("Arial", Font.BOLD, 18));
        equalsButton.setFocusPainted(false);
        equalsButton.addActionListener(this);
        equalsPanel.add(equalsButton);
        add(equalsPanel, BorderLayout.SOUTH);

        setSize(280, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        if (cmd.matches("[0-9]") || cmd.equals(".")) {
            if (isOperatorClicked) {
                displayField.setText("");
                isOperatorClicked = false;
            }
            if (cmd.equals(".") && displayField.getText().contains(".")) {
                return;
            }
            displayField.setText(displayField.getText() + cmd);
        } else if (cmd.equals("C")) {
            displayField.setText("");
            firstOperand = 0;
            operator = "";
            fullExpression = "";
            isOperatorClicked = false;
        } else if (cmd.equals("+") || cmd.equals("-") || cmd.equals("*") || cmd.equals("/")) {
            try {
                firstOperand = Double.parseDouble(displayField.getText());
                operator = cmd;
                fullExpression = displayField.getText() + operator;
                isOperatorClicked = true;
            } catch (NumberFormatException ex) {
                // Ignore if display is empty
            }
        } else if (cmd.equals("=")) {
            if (!operator.isEmpty() && !displayField.getText().isEmpty()) {
                try {
                    double secondOperand = Double.parseDouble(displayField.getText());
                    double result = 0;
                    boolean error = false;

                    switch (operator) {
                        case "+":
                            result = firstOperand + secondOperand;
                            break;
                        case "-":
                            result = firstOperand - secondOperand;
                            break;
                        case "*":
                            result = firstOperand * secondOperand;
                            break;
                        case "/":
                            if (secondOperand == 0) {
                                error = true;
                            } else {
                                result = firstOperand / secondOperand;
                            }
                            break;
                    }

                    if (error) {
                        displayField.setText("Error: Div by 0");
                    } else {
                        String formattedFirst = (firstOperand == (long) firstOperand) ? String.format("%d", (long) firstOperand) : String.valueOf(firstOperand);
                        String formattedSecond = (secondOperand == (long) secondOperand) ? String.format("%d", (long) secondOperand) : String.valueOf(secondOperand);
                        String formattedResult = (result == (long) result) ? String.format("%.1f", result) : String.valueOf(result);

                        displayField.setText(formattedFirst + operator + formattedSecond + "=" + formattedResult);
                    }
                    operator = "";
                    isOperatorClicked = true;
                } catch (NumberFormatException ex) {
                    displayField.setText("Error");
                }
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Q7CalculatorForm());
    }
}
