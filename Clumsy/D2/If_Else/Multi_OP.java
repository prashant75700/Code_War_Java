package If_Else;

import java.util.Scanner;

public class Multi_OP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// A discount Scenario  for students if they are below 18 
        System.out.print("\nWhat is Your Age: ");
        int age = sc.nextInt();

        System.out.print("\nAre You a Student ?? (true/false)");
        boolean IsStudent = sc.nextBoolean();

        System.out.print("\nDid You Have Membership ?? (true/false) ");
        boolean hasmembership = sc.nextBoolean();

        if ( (age < 18 && IsStudent) || hasmembership) {
            System.out.println("\nYou get a 50% discount, yuuhhooo \n");
        }
        else {
            System.out.println("\nYou've to pay full amount, not eligible for any types of discount yet :( \n");
        }
        sc.close();
    }
}
