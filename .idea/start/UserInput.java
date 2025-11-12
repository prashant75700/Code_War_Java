import java.util.Scanner;

public class UserInput {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Pls Enter Your Good Name: ");
        String name = sc.nextLine();

        System.out.println("Plz Enter Your Age: ");
        int age = sc.nextInt();

        System.out.println("Plz Enter your Hieght in meter: ");
        double length = sc.nextDouble();

        System.out.println("\n~~~ Your Info is ~~~");
        System.out.println("Your Name: " + name);
        System.out.println("Your Age: " + age);
        System.out.println("Your Height: " + length);

        sc.close();

    }
}
