package If_Else;

import java.util.Scanner;

public class Temp_Guide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    System.out.println("\n Pls Enter Your surrounding Temperature ");
    double temp = sc.nextDouble();

    if (temp >= 40) {
        System.out.println("It's too Hot outside \n");
    }
    else if (temp >= 30) {
        System.out.println("Outside is warmer than your Ex \n ");
    }
    else if (temp >= 20 ) {
        System.out.println("It's Pleasent Outside , better for Footbal Practice \n ");
    }
    else if (temp >= 10) {
        System.out.println("It's Winter time buddy :) \n");
    }
    else {
        System.out.println("Just wrap yourself or stay with Your mate T-T \n");
    }
    sc.close();

    }
}
