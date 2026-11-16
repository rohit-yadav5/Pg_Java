
import java.util.Scanner;

public class Q3ArithmeticOperations {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first no :");
        int num1 = sc.nextInt();
        System.out.println("enter the second no:");
        int num2 = sc.nextInt();

        int addition = num1 + num2;
        int substraction = num1 - num2;
        int division = num1 / num2;
        int multiplication = num1*num2;
        System.out.println("addition : " + addition);
        System.out.println("substraction : " +substraction);
        System.out.println("multiplication : " +division);
        System.out.println("division : " +multiplication);
    }

}