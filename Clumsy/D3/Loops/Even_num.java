package Clumsy.D3.Loops;

import java.util.Scanner;

public class Even_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Your desirable range for Even Numbers: ");
        int num = sc.nextInt();
        System.out.println("\n");

        for (int i = 0; i <= num; i+=2) {
            System.out.print(i + " ");
        }
        System.out.println(" \n");
        sc.close();
    }
}
