public class MathOperations {
    public static void main(String[] args) {
        int a = 7;
        int b = 3;

        // Addition operation:

        int sum = a + b;
        System.out.println( "Addition: " + a +" + " + b + " = " +sum);
        
        //Substraction OP: 

        int difference = a - b;
        System.out.println("Substraction: "+  a +" - "+ b + " = " + difference);

        //Quotient OP: 

        int division = a / b;
        System.out.println("Division: " + a + " / " + b + " = " + division); // here our output will be in int form (means we will loss the information if our result wil be in the form of double [ 67.836100] )

        double c = 7;
        double d = 4;
        double div = c / d ;
        System.out.println("Div: " + c + " / " + d + " = " + div);

        //Product OP: 

        int Product = a * b;
        System.out.println("Multiplication: " + a + " * " + b + " = " + Product );

        //Modulus OP:

        int remainder = a % b ;
        System.out.println("Modulus: " + a + " % " + b + " = " + remainder);

    }
}
