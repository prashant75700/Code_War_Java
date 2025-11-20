package Clumsy.D3.Array;

import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int [] nums = new int[5];
        System.out.println(" ");
        for(int i = 0; i <= nums.length - 1; i++) {
            System.out.print( "num " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }

        int even_num = 0;
        int odd_num = 0;

        for(int num : nums) {
            if (num % 2 == 0) {
                even_num++;
            }
            else {
                odd_num++;
            }
        }

        System.out.println("\nArray's Element: ");
        for(int num : nums) {
            System.out.print(num + " ");
        }

        System.out.println("\n\nEven Numbers: " + even_num);
        System.out.println("Odd Numbers: " + odd_num + "\n");

        sc.close();

   }
}
