package Clumsy.D3.While_Loop;

public class Basic_break {
    public static void main(String[] args) {
        System.out.println("");
        for(int i = 0; i <= 10; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("");
    }
}
