package Clumsy.D3.Loops;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Your number for the Table: ");
        int num = sc.nextInt();
        System.out.println("");
        for (int i = 1; i <= 10; i++) {
            int result = num * i;
            System.out.println(num + " * " + i + " = " + result);
        }
        System.out.println("");
        sc.close();
    }
}
