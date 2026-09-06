public class SumEvenNumbers {
      public static void main(String[] args) {
            int i = 1; // Start from 1
            int sum = 0; // Variable to store sum

            // Loop until 50
            while (i <= 50) {
                  if (i % 2 == 0) { // Check if number is even
                        sum += i; // Add to sum
                  }
                  i++; // Increment counter
            }

            // Display result
            System.out.println("Sum of even numbers between 1 and 50: " + sum);
      }
}