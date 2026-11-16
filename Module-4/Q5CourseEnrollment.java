import java.util.LinkedHashSet;
import java.util.Scanner;

public class Q5CourseEnrollment {
    private LinkedHashSet<String> students;

    public Q5CourseEnrollment() {
        students = new LinkedHashSet<>();
    }

    public void enrollStudent(String studentName) {
        if (students.add(studentName)) {
            System.out.println("Enrolled: " + studentName);
        } else {
            System.out.println(studentName + " is already enrolled");
        }
    }

    public void displayEnrolledStudents() {
        System.out.println("Enrolled Students: " + students);
    }

    public static void main(String[] args) {
        Q5CourseEnrollment course = new Q5CourseEnrollment();
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        System.out.println("Online Course Enrollment System");
        System.out.println("Enter student name to enroll, 'display' to view list, or 'exit' to quit:");

        while (running) {
            System.out.print("Enroll: ");
            String input = sc.nextLine().trim();

            if (input.equalsIgnoreCase("exit") || input.equalsIgnoreCase("quit")) {
                running = false;
            } else if (input.equalsIgnoreCase("display")) {
                course.displayEnrolledStudents();
            } else if (!input.isEmpty()) {
                course.enrollStudent(input);
            }
        }

        course.displayEnrolledStudents();
        sc.close();
    }
}
