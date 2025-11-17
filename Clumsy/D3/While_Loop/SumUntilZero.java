package Clumsy.D3.While_Loop;

import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        //Here we use while loop to do Sum of numbers until a we hit zero it'll countinue:

        Scanner sc = new Scanner(System.in);

        double sum = 0 ;
        double number = -1;

        System.out.println("\nEnter number to Add ( 0 to Stop )\n");
        while (number != 0) {
            System.out.print("Enter Number:  ");
            number = sc.nextDouble();

            sum += number;

        }
        System.out.println("\nYour Total Sum is " + sum + "\n");
        sc.close();
    }
}
