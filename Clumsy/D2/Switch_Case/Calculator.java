package Switch_Case;

import java.util.Scanner;

public class Calculator {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nPlease Enter your first Number: ");
        double num1 = sc.nextDouble();

        System.out.print("\nPlease Enter your desirable Operator: ( + , - , * , / ): ");
        char op = sc.next().charAt(0);

        System.out.print("\nPlease Enter your last Number: ");
        double num2 = sc.nextDouble();

        double result;

        switch (op) {
            case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result + "\n");
                break;
        
            case '-':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result + "\n");
                break;

            case '*':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result + "\n");
                break;

            case '/':
                if (num2 != 0) {
                    
                    result = num1 / num2 ;
             System.out.println(num1 + " / " + num2 + " = " + result + "\n");
                }
                else {
                    System.out.println("Can not divide by 0 -_- \n");
                }
             break;

            default:
                System.out.println("Invalid Operator -_- \n~~~ Try Again ~~~\n Use These Operator Only ,Coz I'm Not that much talented:( \n~~~ ( + , - , * , / ) \n");
                break;
        }
        sc.close();

    }
}
