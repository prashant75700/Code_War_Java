public class DiscountCal {
    public static void main(String[] args) {
        
        double origenal_price = 750;

        double discount10 = origenal_price - (origenal_price*0.10);
        System.out.println("Your total amount will be " + discount10 + " after 10% discount.");

        double discount30 = origenal_price - (origenal_price*0.30);
        System.out.println("Your total amount will be " + discount30 + " after 30% discount.");

        double discount50 = origenal_price - (origenal_price*0.50);
        System.out.println("Your total amount will be " + discount50 + " after 50% discount.");

        double discount75 = origenal_price - (origenal_price*0.75);
        System.out.println("Your total amount will be " + discount75 + " after 75% discount.");
        
    }
}
