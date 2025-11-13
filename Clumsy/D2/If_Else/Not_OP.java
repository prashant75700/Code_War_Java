package If_Else;

import java.util.Scanner;

public class Not_OP {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("\nIs it Raining Outside (true/false): ");

        boolean IsRaining = sc.nextBoolean();

        if (!IsRaining) {
            System.out.println("\nthere is not a single clue of Rain:( \n");
        }
        else {
            System.out.println("\nIt's Raining dude , just enjoy the weather :) \n");
        }

        sc.close();
    }
}
