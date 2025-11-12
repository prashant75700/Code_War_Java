import java.util.Scanner;

public class AreaCal {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nThis is for Rectangle Shape only: ");

        System.out.println("Pls Enter the length: ");
        double length = sc.nextDouble();

        System.out.println("Pls Enter Your Width: ");
        double width = sc.nextDouble();

        double area = length * width;
        double perimeter = (2* (length + width));

        System.out.println("\n~~~ Results ~~~\n");
        System.out.println("Given length for Rectangle: " + length);
        System.out.println("Given width for Rectangle: " + width);
        System.out.println("Area of Rectangle is : " + area);
        System.out.println("Perimeter of Rectangle is : " + perimeter);
        System.out.println("\n Thank You :) \n");


    }
}
