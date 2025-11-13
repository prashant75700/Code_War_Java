package If_Else;

import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Your desierable Year: ");
        int year = sc.nextInt();

        if (year % 4 == 0) {//if divisible by 4 then leap year 
            
            if (year % 100 == 0) { // if by 100 then it is a century year so we have to check one Extra step 

                if (year % 400 == 0) {// by this we will know that the given year is a leap year 
                    
                    System.out.println("\nprovided year is a leap Year: " + year+"\n400=0");
                }
                else{
                System.out.println("\nProvided year is not a leap Year: " + year+"\n400!=0");
                }

            }
            else {
            System.out.println("\nProvided year is a Leap Year: " + year+"\n100");
            }
        }
        else {
            System.out.println("\nProvided year is not a leap Year: " + year +"\n4");
        }
        sc.close();
    }
}
