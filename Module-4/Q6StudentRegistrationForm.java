import java.awt.*;
import java.awt.event.*;

public class Q6StudentRegistrationForm extends Frame implements ActionListener {

    private TextField nameField;
    private TextField fatherNameField;
    private TextField rollField;
    private TextField ageField;
    private Choice courseChoice;
    private CheckboxGroup genderGroup;
    private Checkbox maleCheckbox, femaleCheckbox;
    private Checkbox hobbyDrawing, hobbySinging, hobbyMusic, hobbyOthers;
    private TextArea addressArea;
    private Button submitButton;
    private Button clearButton;

    public Q6StudentRegistrationForm() {
        super("User Registration Form");

        setLayout(new BorderLayout(10, 10));
        setBackground(new Color(40, 48, 64));

        Label titleLabel = new Label("Registration Form", Label.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        titleLabel.setForeground(Color.YELLOW);
        add(titleLabel, BorderLayout.NORTH);

        Panel formPanel = new Panel();
        formPanel.setLayout(new GridLayout(8, 2, 8, 8));
        formPanel.setBackground(new Color(40, 48, 64));

        Font labelFont = new Font("Arial", Font.PLAIN, 13);
        Color labelColor = Color.WHITE;

        // Name
        Label nameLabel = new Label("Name:");
        nameLabel.setForeground(labelColor);
        nameLabel.setFont(labelFont);
        nameField = new TextField(20);
        formPanel.add(nameLabel);
        formPanel.add(nameField);

        // Father Name
        Label fatherLabel = new Label("Father Name:");
        fatherLabel.setForeground(labelColor);
        fatherLabel.setFont(labelFont);
        fatherNameField = new TextField(20);
        formPanel.add(fatherLabel);
        formPanel.add(fatherNameField);

        // Roll No
        Label rollLabel = new Label("Roll No:");
        rollLabel.setForeground(labelColor);
        rollLabel.setFont(labelFont);
        rollField = new TextField(20);
        formPanel.add(rollLabel);
        formPanel.add(rollField);

        // Age
        Label ageLabel = new Label("Age:");
        ageLabel.setForeground(labelColor);
        ageLabel.setFont(labelFont);
        ageField = new TextField(20);
        formPanel.add(ageLabel);
        formPanel.add(ageField);

        // Gender
        Label genderLabel = new Label("Gender:");
        genderLabel.setForeground(labelColor);
        genderLabel.setFont(labelFont);
        Panel genderPanel = new Panel(new FlowLayout(FlowLayout.LEFT, 5, 0));
        genderGroup = new CheckboxGroup();
        maleCheckbox = new Checkbox("Male", genderGroup, true);
        femaleCheckbox = new Checkbox("Female", genderGroup, false);
        maleCheckbox.setForeground(labelColor);
        femaleCheckbox.setForeground(labelColor);
        genderPanel.add(maleCheckbox);
        genderPanel.add(femaleCheckbox);
        formPanel.add(genderLabel);
        formPanel.add(genderPanel);

        // Course
        Label courseLabel = new Label("Course:");
        courseLabel.setForeground(labelColor);
        courseLabel.setFont(labelFont);
        courseChoice = new Choice();
        courseChoice.add("Java");
        courseChoice.add("Python");
        courseChoice.add("Data Science");
        courseChoice.add("Cloud Computing");
        formPanel.add(courseLabel);
        formPanel.add(courseChoice);

        // Hobbies
        Label hobbiesLabel = new Label("Hobbies:");
        hobbiesLabel.setForeground(labelColor);
        hobbiesLabel.setFont(labelFont);
        Panel hobbiesPanel = new Panel(new FlowLayout(FlowLayout.LEFT, 5, 0));
        hobbyDrawing = new Checkbox("Drawing");
        hobbySinging = new Checkbox("Singing");
        hobbyMusic = new Checkbox("Music");
        hobbyOthers = new Checkbox("Others");
        hobbyDrawing.setForeground(labelColor);
        hobbySinging.setForeground(labelColor);
        hobbyMusic.setForeground(labelColor);
        hobbyOthers.setForeground(labelColor);
        hobbiesPanel.add(hobbyDrawing);
        hobbiesPanel.add(hobbySinging);
        hobbiesPanel.add(hobbyMusic);
        hobbiesPanel.add(hobbyOthers);
        formPanel.add(hobbiesLabel);
        formPanel.add(hobbiesPanel);

        // Address
        Label addressLabel = new Label("Address:");
        addressLabel.setForeground(labelColor);
        addressLabel.setFont(labelFont);
        addressArea = new TextArea(3, 20);
        formPanel.add(addressLabel);
        formPanel.add(addressArea);

        add(formPanel, BorderLayout.CENTER);

        // Button Panel
        Panel buttonPanel = new Panel(new FlowLayout(FlowLayout.CENTER, 15, 10));
        buttonPanel.setBackground(new Color(40, 48, 64));

        submitButton = new Button("Save Details");
        submitButton.setBackground(new Color(0, 102, 204));
        submitButton.setForeground(Color.WHITE);
        submitButton.addActionListener(this);

        clearButton = new Button("Clear All");
        clearButton.setBackground(new Color(204, 0, 0));
        clearButton.setForeground(Color.WHITE);
        clearButton.addActionListener(this);

        buttonPanel.add(submitButton);
        buttonPanel.add(clearButton);
        add(buttonPanel, BorderLayout.SOUTH);

        setSize(480, 520);
        setLocationRelativeTo(null);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            String name = nameField.getText().trim();
            String father = fatherNameField.getText().trim();
            String roll = rollField.getText().trim();
            String age = ageField.getText().trim();
            String gender = genderGroup.getSelectedCheckbox() != null ? genderGroup.getSelectedCheckbox().getLabel() : "N/A";
            String course = courseChoice.getSelectedItem();

            StringBuilder hobbies = new StringBuilder();
            if (hobbyDrawing.getState()) hobbies.append("Drawing ");
            if (hobbySinging.getState()) hobbies.append("Singing ");
            if (hobbyMusic.getState()) hobbies.append("Music ");
            if (hobbyOthers.getState()) hobbies.append("Others ");
            String hobbiesStr = hobbies.length() > 0 ? hobbies.toString().trim() : "None";

            String address = addressArea.getText().trim();

            String details = "Student Registration Successful!\n\n" +
                    "Name: " + name + "\n" +
                    "Father Name: " + father + "\n" +
                    "Roll No: " + roll + "\n" +
                    "Age: " + age + "\n" +
                    "Gender: " + gender + "\n" +
                    "Course: " + course + "\n" +
                    "Hobbies: " + hobbiesStr + "\n" +
                    "Address: " + address;

            System.out.println("=== Registration Details Submitted ===");
            System.out.println(details);

            showSuccessDialog(details);
        } else if (e.getSource() == clearButton) {
            nameField.setText("");
            fatherNameField.setText("");
            rollField.setText("");
            ageField.setText("");
            addressArea.setText("");
            hobbyDrawing.setState(false);
            hobbySinging.setState(false);
            hobbyMusic.setState(false);
            hobbyOthers.setState(false);
        }
    }

    private void showSuccessDialog(String message) {
        Dialog dialog = new Dialog(this, "Registration Success", true);
        dialog.setLayout(new BorderLayout(10, 10));
        dialog.setSize(380, 280);
        dialog.setLocationRelativeTo(this);

        TextArea displayArea = new TextArea(message, 10, 30, TextArea.SCROLLBARS_VERTICAL_ONLY);
        displayArea.setEditable(false);
        dialog.add(displayArea, BorderLayout.CENTER);

        Button okButton = new Button("OK");
        okButton.addActionListener(e -> dialog.dispose());
        Panel p = new Panel();
        p.add(okButton);
        dialog.add(p, BorderLayout.SOUTH);

        dialog.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dialog.dispose();
            }
        });

        dialog.setVisible(true);
    }

    public static void main(String[] args) {
        new Q6StudentRegistrationForm();
    }
}
