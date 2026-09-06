import java.util.Scanner;

public class MaxInArray {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Declare an array of size 10
            int[] numbers = new int[10];

            // Input 10 integers
            System.out.println("Enter 10 integers:");
            for (int i = 0; i < numbers.length; i++) {
                  System.out.print("Number " + (i + 1) + ": ");
                  numbers[i] = sc.nextInt();
            }

            // Assume first element is maximum
            int max = numbers[0];

            // Loop to find maximum
            for (int i = 1; i < numbers.length; i++) {
                  if (numbers[i] > max) {
                        max = numbers[i];
                  }
            }

            // Display maximum value
            System.out.println("\nMaximum value in the array: " + max);

            sc.close();
      }
}