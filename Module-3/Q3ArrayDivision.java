import java.util.Arrays;
import java.util.Scanner;

public class Q3ArrayDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40};

        System.out.println("Array: " + Arrays.toString(arr));

        System.out.print("Enter index: ");
        int index = sc.nextInt();

        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();

        try {
            int element = arr[index];
            int result = element / divisor;
            System.out.println("Result: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: Array index out of bounds");
        } catch (ArithmeticException e) {
            System.out.println("Exception: Division by zero not allowed");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}
