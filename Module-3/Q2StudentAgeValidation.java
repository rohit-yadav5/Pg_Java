import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class Student {
    private String name;
    private int age;

    public void registerStudent(String name, int age) throws InvalidAgeException {
        if (age <= 17) {
            throw new InvalidAgeException("Age must be above 17 for registration");
        }
        this.name = name;
        this.age = age;
        System.out.println("Student " + name + " registered successfully with age " + age);
    }

    public void registerStudent(int age) throws InvalidAgeException {
        registerStudent("Student", age);
    }
}

public class Q2StudentAgeValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        Student student = new Student();

        try {
            student.registerStudent(name, age);
        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}
