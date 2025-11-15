package Clumsy.D3.Loops;

public class Patterns {
    public static void main(String[] args) {
        
       System.out.println("");
        //Pattern 1:
        System.out.println("Pattern 1\n");
        for (int i = 1; i<=5; i++) { 
            System.out.println("*");
        }
        System.out.println("");

        //Pattern 2: 
        System.out.println("Pattern 2\n");
        for (int i = 1; i <= 5; i++) {
            System.out.print("* ");
        }
        System.out.println("");

        //Pattern 3:
         System.out.println("\nHere we can see a Start Pattern, using loops :) \n");
         System.out.println("Pattern 3: \n");
 
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("");

        //Pattern 4:
        System.out.println("Pattern 4\n");
       
         for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("");
        
        //Pattern 5:
        System.out.println("\nPattern 5: \n");
        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j > i; j--) {
                System.out.print(" "); // here we gave only 1 space , which creats different pattern 
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* " );
            }
            System.out.println("");
        }
        System.out.print("\n");

        //Pattern 6: 
        System.out.println("Pattern 6: \n");
        for (int i = 5; i >= 1; i--) {
         // Print spaces
        for (int j = 5; j > i; j--) {
           System.out.print("  ");  //here we gave 2 spaces, that creats different pattern 
           }
         // Print stars
        for (int k = 1; k <= i; k++) {
           System.out.print("* ");
           }
          System.out.println("");
          }
          System.out.println("");

          //Pattern 7:
          System.out.println("Pattern 7: \n");

          for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("  ");
            }
            for ( int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println("");
          }

          //Pattern 8:
          System.out.println("\nPattern 8: \n");
          for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 5; k++) {
                System.out.print("* ");
            }
            System.out.println("");
          }
          System.out.println("");
    
    }
}
