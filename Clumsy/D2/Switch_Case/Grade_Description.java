package Switch_Case;

import java.util.Scanner;

public class Grade_Description {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nPlase Enter Your Grade among ( A , B , C , D , E , F ) :  ");
        char grade = sc.next().charAt(0);

        grade = Character.toUpperCase(grade);

        switch (grade) {
            case 'A' :
                System.out.println("\nOutstanding , You secured an incrediable grade " + grade + "\n");
                break;

                case 'B':
                System.out.println("\nAmazing you scored good: " + grade +"\n");
                break;
            case 'C':
                System.out.println("\nWell Done you scored good: " + grade +"\n");
                break;
            case 'D':
                System.out.println("\nAt least you are above than others , you scored good: " + grade +"\n");
                break;
            case 'E':
                System.out.println("\nUfff At least You passed Your exam : " + grade +"\n");
                break;
            case 'F':
                System.out.println("\nPhhheeeww You didn't pass , don't worry ,: " + grade +"\nTry Again \n");
                break;


            default:
                System.out.println("\nEnter A valid Grade u bitch: -_-\n");
                break;
        }
        sc.close();
    }
}
