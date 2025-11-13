package If_Else;

import java.util.Scanner;

public class And_OP {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("\nPls Enter Your Age: ");
        int age = sc.nextInt();

       // System.out.print(" \n Did You Have Liences ?? (True/False) :  ");
       // boolean hasLiences = sc.nextBoolean();

        // if (age >= 18 && hasLiences) {
        //     System.out.println("\nYou can Drive \n");
        // }
        // else {
        //     System.out.println("\nYou can't Drive \n ");
        // }

        //just cheaking equalsIgnorecase

        System.out.print(" \n Did You Have Liences ?? (True/False) :  ");
        String responce = sc.next();

        boolean hasLiences = responce.equalsIgnoreCase("Yes");  
        
         if (age >= 18 && hasLiences) {
            System.out.println("\nYou can Drive \n");
        }
        else {
            System.out.println("\nYou can't Drive \n ");
        }

        sc.close();
    }
}
