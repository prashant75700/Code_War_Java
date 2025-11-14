package Switch_Case;

import java.util.Scanner;

public class Month_Days_Cal {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("\nPlease Enter Your Month number: among 1 to 12 ::  ");
        int month = sc.nextInt();
        int days;


        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                System.out.println("\nThis Month has " + days + " Days.\n");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                System.out.println("\nThis Month has " + days + " Days\n");
                break;
            case 2:
                System.out.println("\nThis Month has 28 or 29 Days [Due to leap Year]\n");
                break;

            default:
                System.out.print("\nYou Bitch , Enter a valid Month number -_- : \n\n");
                break;
        }
        sc.close();
    }
}
