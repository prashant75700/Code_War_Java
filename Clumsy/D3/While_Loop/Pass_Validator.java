package Clumsy.D3.While_Loop;

import java.util.Scanner;

public class Pass_Validator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctpassword = "Sora123";
        String userInput = "";

        // keep asking until correct Password

        while (!userInput.equals(correctpassword)) {
            System.out.print("\nEnter Password: ");
            userInput = sc.nextLine();

            if (!userInput.equals(correctpassword)) {
                System.out.println("\n~~~ Wrong Password! Try Again. ");
            }
        }

        System.out.println("\nAccess Granted! Welcome!\n");

        sc.close();
    }
}
