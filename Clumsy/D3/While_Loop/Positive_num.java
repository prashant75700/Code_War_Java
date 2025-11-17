package Clumsy.D3.While_Loop;

import java.util.Scanner;

public class Positive_num {
    public static void main(String[] args) {
        
        //So basically here we ask from the User to Enter a positive number, Using while loop it keep asking until the correct one found :  

        Scanner sc = new Scanner(System.in);

        double userNum = -1;

        while (userNum <= 0 ) {
            System.out.print("\nPlease Enter a Positive Number: ");
            userNum = sc.nextDouble();

            if (userNum <= 0) {
                System.out.println("\nYou Entered a Non Positive number -_- ");
                System.out.println("~~~ Try Again ~~~");
            }
        }
        System.out.println("\nYou Entered " + userNum +  ",It's a Positive Number. Yooohhhooo :) \n");
        sc.close();
    }
}
