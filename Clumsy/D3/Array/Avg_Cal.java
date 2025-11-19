package Clumsy.D3.Array;

import java.util.Scanner;

public class Avg_Cal {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int [] marks = new int[5];
        System.out.println("");

        //Input marks from user
        for (int i = 0; i <marks.length; i++) {

            System.out.print("Student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        // sum of marks:
        int sum = 0;
        for(int mark : marks) {
            sum += mark;
        }

        //avg of Marks:

        double avg = (double) sum / marks.length;

        //Printing the Inputs & task:

        System.out.println("\n=== Result ===");
        System.out.println("Sum of Marks: " + sum);
        System.out.println("Average of Marks: " + avg + "\n");

        sc.close();

    }
}
