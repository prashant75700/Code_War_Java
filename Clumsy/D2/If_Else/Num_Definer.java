package If_Else;

import java.util.Scanner;

public class Num_Definer {
    public static void main(String[] args) {
        System.out.print("\nEnter Your Number: ");
/////////here we try to get an inpur from the user & tell them that his/her number varies among positive, negative & Zero.
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("\nYour number is Positive.\n");
        }
        else if (num < 0 ) {
            System.out.println("\nYour number is Negative.\n");
        }
        else {
            System.out.println("\nYour number is Zero.\n");
        }
        sc.close();
    }
}
