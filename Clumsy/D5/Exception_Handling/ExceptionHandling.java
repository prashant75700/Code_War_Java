package Clumsy.D5.Exception_Handling;

import java.util.Scanner;
import java.util.ArrayList;

// It's a copied code from claude, just for reference 

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // EXAMPLE 1: Division by Zero
        System.out.println("========== EXAMPLE 1: DIVISION ==========");
        try {
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();
            
            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();
            
            int result = num1 / num2;  // Might throw exception
            System.out.println("Result: " + result);
            
        } catch (ArithmeticException e) {
            System.out.println("❌ Error: Cannot divide by zero!");
        } catch (Exception e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
        
        System.out.println("✓ Program continues...\n");
        
        // EXAMPLE 2: Array Index Out of Bounds
        System.out.println("========== EXAMPLE 2: ARRAY ACCESS ==========");
        int[] numbers = {10, 20, 30, 40, 50};
        
        try {
            System.out.print("Enter index (0-4): ");
            int index = scanner.nextInt();
            
            System.out.println("Value at index " + index + ": " + numbers[index]);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("❌ Error: Invalid index! Array has only 5 elements (0-4)");
        }
        
        System.out.println("✓ Program continues...\n");
        
        // EXAMPLE 3: ArrayList with Exception Handling
        System.out.println("========== EXAMPLE 3: ARRAYLIST ==========");
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        
        try {
            System.out.print("Enter index to access (0-" + (names.size() - 1) + "): ");
            int index = scanner.nextInt();
            
            String name = names.get(index);
            System.out.println("Name: " + name);
            
        } catch (IndexOutOfBoundsException e) {
            System.out.println("❌ Error: Index out of bounds!");
        }
        
        System.out.println("✓ Program continues...\n");
        
        // EXAMPLE 4: Number Format Exception
        System.out.println("========== EXAMPLE 4: STRING TO NUMBER ==========");
        scanner.nextLine();  // Clear buffer
        
        try {
            System.out.print("Enter a number: ");
            String input = scanner.nextLine();
            
            int number = Integer.parseInt(input);  // Might throw exception
            System.out.println("You entered: " + number);
            System.out.println("Double: " + (number * 2));
            
        } catch (NumberFormatException e) {
            System.out.println("❌ Error: That's not a valid number!");
        }
        
        System.out.println("✓ Program continues...\n");
        
        // EXAMPLE 5: Multiple Catch Blocks
        System.out.println("========== EXAMPLE 5: MULTIPLE EXCEPTIONS ==========");
        try {
            System.out.print("Enter array size: ");
            int size = scanner.nextInt();
            
            int[] arr = new int[size];  // Might throw NegativeArraySizeException
            
            System.out.print("Enter index to set: ");
            int index = scanner.nextInt();
            
            System.out.print("Enter value: ");
            int value = scanner.nextInt();
            
            arr[index] = value;  // Might throw ArrayIndexOutOfBoundsException
            
            System.out.println("✓ Value set successfully!");
            
        } catch (NegativeArraySizeException e) {
            System.out.println("❌ Error: Array size cannot be negative!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("❌ Error: Index out of bounds!");
        } catch (Exception e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
        
        System.out.println("✓ Program continues...\n");
        
        // EXAMPLE 6: Finally Block
        System.out.println("========== EXAMPLE 6: FINALLY BLOCK ==========");
        try {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            
            int result = 100 / num;
            System.out.println("Result: " + result);
            
        } catch (ArithmeticException e) {
            System.out.println("❌ Error: Division by zero!");
        } finally {
            // This ALWAYS runs, whether error occurs or not!
            System.out.println("✓ Finally block executed (cleanup code)");
        }
        
        System.out.println("\n========== ALL EXAMPLES COMPLETED ==========");
        System.out.println("✓ Program finished successfully!");
        
        scanner.close();
    }
}
