package If_Else;

import java.util.Scanner;

public class Voting_Eligibility {
    public static void main(String[] args) {

        System.out.println("\nPls Enter Your Age: ");
        Scanner sc = new Scanner(System.in);

        int age =  sc.nextInt();

        if (age >= 18) {
            System.out.println("you can Vote Buddy :) ");
        }
        else{
        System.out.println("You are a Minor , wait for your turn:( \n");
        }
        sc.close();
    }
}
