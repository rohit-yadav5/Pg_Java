
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("ROhit YADAV");
        System.out.println("yadavji");

        Studentclass.runwork();
    }
}
class Studentclass {
    public static void runwork() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter student name: ");
        String studentName = sc.nextLine();

        System.out.print("Enter roll number: ");
        int rollno = sc.nextInt();

        System.out.println("student marks:");
        float marks = sc.nextFloat();


        System.out.println("rawat ka name kya hn");
        System.out.println("roll no: " + rollno);
        System.out.println("student name: " + studentName);
        System.out.println("marks: " + marks);
        
    }
}

