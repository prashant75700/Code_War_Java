package If_Else;

public class If3 {
    
    public static void main(String[] args) {
        int x = 12;
        int y = 6;

        System.out.println("X = " + x);
        System.out.println("Y = " + y + "\n");

        if (x == 12) {
            System.out.println("X is equal to 12 ");
        }
        if (x != y) {
            System.out.println("X is not equal to Y ");
        }
        if (x > y) {
            System.out.println("X is greater than Y ");
        }
        if (y < x) {
            System.out.println("X is not less than Y ");
        }
        if (x >= 12) {
            System.out.println("X is greater than or Equal to 12 ");
        }
    }
}
