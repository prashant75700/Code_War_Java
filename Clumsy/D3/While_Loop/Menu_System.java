package Clumsy.D3.While_Loop;

import java.util.Scanner;

public class Menu_System {
    public static void main(String[] args) {
        
        //Here we use Do_While loop for a Menu System:

        Scanner sc = new Scanner(System.in);
        int choice;

        do{
            System.out.println("\n=== Main Menu ===");
            System.out.println("1. Play Game");
            System.out.println("2. Setting");
            System.out.println("3. Help");
            System.out.println("4. Exit");
            System.out.print("Enter Choice \'1 - 4\' : ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nGame Loading ~~~");
                    break;
                
                case 2:
                    System.out.println("\nOpening Setting ~~~");
                    break;

                case 3:
                    System.out.println("\nOpening Help Centre ~~~");
                    break;

                case 4:
                    System.out.println("\nGoodbye 👋👋 \n");
                    break;

                default:
                    System.out.println("\nEnter a Valid Choice [ 1 to 4 ]");
                    break;
            }

        }
        while ( choice != 4);
        
        sc.close();
    }
}
