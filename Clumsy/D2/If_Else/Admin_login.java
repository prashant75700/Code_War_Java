package If_Else;

import java.util.Scanner;

public class Admin_login {
    
    public static void main(String[] args) {
        
        // here we made a login System to check 

        Scanner sc = new Scanner(System.in);

        String origenal_username = "Sora";
        String origenal_password = "7012@/";

        System.out.print("\nEnter Username: ");
        String user = sc.nextLine();

        System.out.print("\nEnter Password: ");
        String pass = sc.nextLine();

        if ((origenal_username.equals(user)) && (origenal_password.equals(pass))) {
            System.out.println("\n~~~Login Successful~~~\n Welcome " + user + "!\n");
        
        }
        else if (!origenal_username.equals(user)) {
            System.out.println("\nInvalid Username\n ~~~ Try Again ~~~\n");
        }
        else {
            System.out.println("\nInvalid Password\n ~~~ Try Again ~~~\n");
        }
        sc.close();

    }
}
