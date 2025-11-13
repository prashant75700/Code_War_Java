package If_Else;

import java.util.Scanner;

public class Largest_of_Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Your First number: ");
        int  num1 = sc.nextInt();

        System.out.print("\nEnter Your Second number: ");
        int num2 = sc.nextInt();

        System.out.print("\nEnter Your Third number: ");
        int num3 = sc.nextInt();

        if ((num1 >= num2) && (num1 >= num3)) {
            System.out.println("Your First given number is Greater than all of them: " + num1);
        }
        else if ((num2 >= num1) && (num2 >= num3)) {
            System.out.println("Your Second number is the greater than all of them: " + num2);
        }
        else {
            System.out.println("Your Third number is Greater than all of them: " + num3);
        }
        sc.close();
    }
}
