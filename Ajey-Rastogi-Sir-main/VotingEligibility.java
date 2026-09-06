import java.util.Scanner;

public class VotingEligibility {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Input age
            System.out.print("Enter age: ");
            int age = sc.nextInt();

            // Input citizenship status (true/false)
            System.out.print("Are you a citizen? (true/false): ");
            boolean isCitizen = sc.nextBoolean();

            // Eligibility check using logical operators
            if (age >= 18 && isCitizen) {
                  System.out.println("You are eligible to vote.");
            } else {
                  System.out.println("You are NOT eligible to vote.");
            }

            sc.close();
      }
}