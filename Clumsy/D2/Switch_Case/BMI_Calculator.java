package Switch_Case;

import java.util.Scanner;

public class BMI_Calculator {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\nPlease Enter Your Weight in kgs : ");
        double weight = sc.nextDouble();

        System.out.print("\nPlease Enter Your Height in MTR : ");
        double height = sc.nextDouble();

        double bmi = weight / (height*height); //this will calculate users BMI lvl

        System.out.println("\nYour BMI lvl is " + bmi );

        if (bmi < 18.5) {
            System.out.println("\nYou'r under_weight: Take some neutrients Buddy. \n ");
        }
        else if (bmi < 25) {
            System.out.println("\nYou'r perfect in BMI lvl , maintain Your Body:\n");
        }
        else if (bmi < 30) { 
            System.out.println("\nYou'r OverWeight , Do some Exercise:)\n ");
        }

        else {
            System.out.println("\n Obese :( ");
            //here we entered the nested if 
                //this will now cheack for the "Obese lvl"
            if (bmi <35 ) {
                System.out.println("\n Obesity lvl 1");
            }
            else if (bmi < 40 ) {
                System.out.println("\nObesity lvl 2nd");
            }
            else {
                System.out.println("\nObesity lvl 3rd");
            }
            //here we exit the nested if 

            System.out.println("\nAdvice: Please Consult a Doctor!\n");
        }
        

        sc.close();
    }
}
