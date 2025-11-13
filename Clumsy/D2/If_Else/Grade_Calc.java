package If_Else;

import java.util.Scanner;

public class Grade_Calc {
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);

        System.out.println("\nPlease Enter Your Score btw 0 - 100 ");
        int score =  sc.nextInt();

        if (score >= 90) {
            System.out.println("\nGrade \'A\' - Amazing \n");
        }
        else if (score >= 80) {
            System.out.println("\nGrade \'B\'  Great \n");
        }
        else if (score >= 70 ) {
            System.out.println("\nGrade \'C\'  Good \n");
        }
        else if (score >= 60 ) {
            System.out.println( "\nGrade \'D\'  Pass \n");
        }
        else {
            System.out.println("\n So Sad but you Failed :( \n");
        }
        sc.close();
    }
}
