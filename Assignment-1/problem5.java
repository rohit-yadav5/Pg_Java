
import java.util.Scanner;
public class problem5 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no1 ");
        int no1 = sc.nextInt();
        System.out.println("enter second no ");
        int no2 = sc.nextInt();
        System.out.println("enter operator");
         char operator = sc.next().charAt(0);
            
          if (operator == '+'){
            int sum = no1+no2;
            System.out.println(sum);
          } else { 
            if (operator == '-'){
                int substraction = no1-no2;
                System.out.println(substraction);
            } else {
                if ( operator == '*'){
                    int multiplication = no1*no2;
                    System.out.println(multiplication);
                } else {
                    if (operator == '/'){
                        int division = no1/no2;
                        System.out.println(division);
                    }
                }
            }
          } 
    }

}