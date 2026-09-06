class Course {
    private String courseName;
    private String duration;

    Course(String courseName, String duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getDuration() {
        return duration;
    }
}

class Student {
    protected String name;
    protected Course enrolledCourse;

    Student(String name, Course enrolledCourse) {
        this.name = name;
        this.enrolledCourse = enrolledCourse;
    }

    @Override
    public String toString() {
        return "Student: " + name +
                " Course: " +
                enrolledCourse.getCourseName() +
                " (" + enrolledCourse.getDuration() + ")";
    }
}

class PremiumStudent extends Student {
    private double discount;

    PremiumStudent(String name, Course enrolledCourse,
                   double discount) {

        super(name, enrolledCourse);
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Premium Student: " + name +
                " Course: " +
                enrolledCourse.getCourseName() +
                " (" + enrolledCourse.getDuration() +
                ") Discount: " + discount + "%";
    }
}

public class Q9OnlineCourse {
    public static void main(String[] args) {

        Course course =
                new Course("Java", "3 months");

        Student student =
                new Student("Arjun", course);

        PremiumStudent premiumStudent =
                new PremiumStudent("Meena", course, 20);

        System.out.println(student);
        System.out.println(premiumStudent);
    }
}