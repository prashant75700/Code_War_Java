package Switch_Case;

import java.util.Scanner;

public class Weekend_Checker {
    public static void main(String[] args) {
        
    // here we learn if we forgot to add break btw cases , & it;s use cases as well 

    Scanner sc =  new Scanner(System.in);
    System.out.print("\nPlease enter your week number among 1 to 7 : ");

    int num =  sc.nextInt();

        switch (num) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("\nIt's a Week Day , You've to work : ( \n");
                break;

            case 6:
            case 7:
                System.out.println("\nIt's a Weekend , Enjoy buddyyyy : ) \n");
                break;
            default:
                System.out.println("\nOhhho You dumb , as i Said Enter a Week number among 1 to 7 only -_-\n");
                break;
        }
        sc.close();
    }
}
