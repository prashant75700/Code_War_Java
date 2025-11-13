package If_Else;

import java.util.Scanner;

public class If2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        
        System.out.println("\nPlz Enter your Age in Digit: ");
        int age = sc.nextInt();

        if (age >= 18 && age <= 23) {
            System.out.println("You are a Dumb person, Go & leran something dude T-T  ");
        } 
        else if (age >= 24) {
            System.out.println("You are a good man IC , but Everyone needs to be hubmle & Kind for their close one's & poors ");
        }
        else if (age < 18) {
            System.out.println("Go back Simon T-T ");

            
        }
        

        sc.close();

    }
}
