import java.util.*;

class Professor {
    private String name;
    private String employeeId;
    private String specialization;

    Professor() {}

    Professor(String name, String employeeId, String specialization) {
        this.name = name;
        this.employeeId = employeeId;
        this.specialization = specialization;
    }

    public String toString() {
        return "Name: " + name + ", ID: " + employeeId +
               ", Specialization: " + specialization;
    }
}

class Department {
    private String deptName;
    private String hodName;
    private List<Professor> professors;

    Department() {
        professors = new ArrayList<>();
    }

    Department(String deptName, String hodName) {
        this.deptName = deptName;
        this.hodName = hodName;
        professors = new ArrayList<>();
    }

    public void addProfessor(Professor p) {
        professors.add(p);
    }

    public String toString() {
        String result = "Department: " + deptName +
                "\nHOD: " + hodName +
                "\nProfessors:\n";

        for (Professor p : professors) {
            result += p + "\n";
        }

        return result;
    }
}

public class Q1University {
    public static void main(String[] args) {
        Department d = new Department("Computer Science", "Dr. Mehta");

        d.addProfessor(new Professor("Arjun", "P101", "AI"));
        d.addProfessor(new Professor("Neha", "P102", "ML"));

        System.out.println(d);
    }
}