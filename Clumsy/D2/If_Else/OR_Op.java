package If_Else;

import java.util.Scanner;

public class OR_Op {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nIs it Holiday today ?? (true/false) :  ");
        boolean IsHoliday = sc.nextBoolean();

        System.out.print("\nIs it Weekend ?? (true/false) :  ");
        boolean IsWeekend = sc.nextBoolean();

        if (IsWeekend || IsHoliday ) {
            System.out.println("\nNo work Today yeepppi\n");
        }
        else {
            System.out.println("\nShit yrr , You've to work Today :(  \n");
        }

        //we can use also for the yes or No things :
        //String responce = sc.next();
        // boolean IsHoliday = responce.equalsIgnorecase("yes");

        sc.close();
    }
}
