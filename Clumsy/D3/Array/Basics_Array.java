package Clumsy.D3.Array;

import java.util.Scanner;

public class Basics_Array {
    public static void main(String[] args) {
        
        //first Methode to Represent an Array is: 

        int [] score = {56,45,23,10,50};

        System.out.println("\nHigh Scorer: " + score[0]);
        System.out.println("Lowest Scrorer: " + score[3]);
        System.out.println("Last Scorer: " + score [4] + "\n");


        // Second way to Represent An Array:

        int [] num = new int[5];
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        num[0] = sc.nextInt();
        System.out.print("Enter Your Number: ");
        num[1] = sc.nextInt();
        System.out.print("Enter Your Number: ");
        num[2] = sc.nextInt();
        System.out.print("Enter Your Number: ");
        num[3] = sc.nextInt();
        System.out.print("Enter Your Number: ");
        num[4] = sc.nextInt();
        
        System.err.println("\nFirst input: " + num[0]);
        System.err.println("Second input: " + num[1]);
        System.err.println("Third input: " + num[2]);
        System.err.println("Fourth input: " + num[3]);
        System.err.println("Fifth input: " + num[4]);
        System.out.println("");


        //This is the third way to implement an Array: called as mixup Array: 

        int [] age = {45, 12, 53, 20, 67};

        String [] gun = {"Amit", "Arav", "Anshika", "Pranav", "Paramveer"};

        double [] rank = {26.4, 54.2, 20, 45.8, 35};

        boolean [] info = {true,false,true,true};

        System.out.println("Eldest: " + age[4] );
        System.out.println("Female: " + gun[2]);
        System.out.println("Best score: " + rank[1]);
        System.out.println("Info is " + info[1]);
        System.out.println("");

        sc.close();
        
    }
}
