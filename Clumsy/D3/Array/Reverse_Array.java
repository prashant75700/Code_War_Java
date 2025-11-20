package Clumsy.D3.Array;

public class Reverse_Array {
    public static void main(String[] args) {
        
        int [] nums = {45,12,18,46,32,60};

        System.out.println("\nOG Array: ");
        for(int num : nums) {
            System.out.print(num + " ");
        }

        System.out.println("\n\nReversed Array: ");
        
        for(int i = nums.length - 1; i >= 0; i--) {
            System.out.print( nums[i] + " " );
        }
        System.out.println("\n");
    }
}
