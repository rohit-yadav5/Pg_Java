import java.util.HashSet;
import java.util.Scanner;

class Attendance {
    private HashSet<String> attendanceSet;

    public Attendance() {
        attendanceSet = new HashSet<>();
    }

    public void markAttendance(String studentName) {
        if (attendanceSet.add(studentName)) {
            System.out.println("Attendance marked for " + studentName);
        } else {
            System.out.println(studentName + " is already marked present");
        }
    }

    public void displayAttendance() {
        System.out.println("\n--- Attendance List ---");
        if (attendanceSet.isEmpty()) {
            System.out.println("(No students marked present yet)");
        } else {
            for (String student : attendanceSet) {
                System.out.println("- " + student);
            }
        }
    }
}

public class Q2AttendanceSystem {
    public static void main(String[] args) {
        Attendance attendance = new Attendance();
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        System.out.println("Student Attendance System");
        System.out.println("Type 'exit' or 'done' to finish marking attendance, or 'show' to view list.");

        while (running) {
            System.out.print("Enter name to mark attendance: ");
            String name = sc.nextLine().trim();

            if (name.equalsIgnoreCase("exit") || name.equalsIgnoreCase("done")) {
                running = false;
            } else if (name.equalsIgnoreCase("show")) {
                attendance.displayAttendance();
            } else if (!name.isEmpty()) {
                attendance.markAttendance(name);
            }
        }

        attendance.displayAttendance();
        sc.close();
    }
}
