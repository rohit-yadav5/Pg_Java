import java.util.Scanner;

public class Q8StoreAndPrintMarks {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Declare an array to store marks of 5 students
            int[] marks = new int[5];

            // Input marks
            System.out.println("Enter marks of 5 students:");
            for (int i = 0; i < marks.length; i++) {
                  System.out.print("Student " + (i + 1) + ": ");
                  marks[i] = sc.nextInt();
            }

            // Print marks
            System.out.println("\nMarks of Students:");
            for (int i = 0; i < marks.length; i++) {
                  System.out.println("Student " + (i + 1) + ": " + marks[i]);
            }

            sc.close();
      }
    
}
