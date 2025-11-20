package Clumsy.D3.Array;

import java.util.Scanner;

public class Largest {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] numbers = new int[5];

        System.out.println("\nEnter Your Numbers: ");

        // to take input's Array from user:

        for(int i = 0; i < numbers.length; i++) {
            System.out.print("Num " + (i + 1) + ": ");
            numbers[i] = sc.nextInt(); 
        }

        //To print all the numbers from the Arrays:
        int largets = numbers[0];
        for(int k = 1; k < numbers.length; k++ ) {

            if (numbers[k] > largets) {
                largets = numbers[k];
            }
        }

        System.out.println("\nArray Elements: ");
        
        for( int num : numbers) {
            System.out.println(num + " ");
        }

        System.out.println("\nLargest Number: " + largets);
        System.out.println("");

        sc.close();

        
    }
}
