package Switch_Case;

import java.util.Scanner;

public class Case_understanding {

    public static void main(String[] args) {
        
    Scanner sc =  new Scanner(System.in);

    System.out.print("Plase Enter a number among 1-7:  ");
        int num = sc.nextInt();
        
        switch (num) {
            case 1:
                System.out.println("It's Monday :( ");
                break;
            
            case 2: 
                System.out.println("It's Tuesday ");
                break;
            
            case 3:
                System.out.println("It's Wednesday ");
                break;

            case 4:
                System.out.println("It's Thursday :) ");
                break;

            case 5:
                System.out.println("It's Friday Today , yeaapppy :)) ");
                break;

            case 6:
                System.out.println("It's Saturday , Yuhhhoooo ");
                break;

            case 7: 
                System.out.println("it's Sunday , too sad again we have to workk shiiit :( ");
                break;
        
            default:
                System.out.println("Ewwww You Entered a wrong number , \n ~~~ Try again ~~~\n ");
                break;
        }
        sc.close();

    }


}
    
