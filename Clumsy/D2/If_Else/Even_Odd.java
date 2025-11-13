package If_Else;

import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        
        System.out.println("\nPls Enter your number :( ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Your number is Even \n");
        }
        else {
            System.out.println("Your number is Odd \n");
        }
        sc.close();
    }
}
