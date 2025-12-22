package Clumsy.D5.Exception_Handling;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

//copied code from claude, just for reference 

public class FileIODemo {
    public static void main(String[] args) {
        
        // EXAMPLE 1: Write to File
        System.out.println("========== WRITING TO FILE ==========");
        writeToFile();
        
        // EXAMPLE 2: Read from File
        System.out.println("\n========== READING FROM FILE ==========");
        readFromFile();
        
        // EXAMPLE 3: Append to File
        System.out.println("\n========== APPENDING TO FILE ==========");
        appendToFile();
        readFromFile();
        
        // EXAMPLE 4: Check if File Exists
        System.out.println("\n========== CHECKING FILE ==========");
        checkFile();
    }
    
    // Method 1: Write to file
    public static void writeToFile() {
        try {
            FileWriter writer = new FileWriter("data.txt");
            
            writer.write("Hello, World!\n");
            writer.write("This is line 2\n");
            writer.write("This is line 3\n");
            
            writer.close();
            System.out.println("✓ File written successfully!");
            
        } catch (IOException e) {
            System.out.println("❌ Error writing to file: " + e.getMessage());
        }
    }
    
    // Method 2: Read from file
    public static void readFromFile() {
        try {
            FileReader reader = new FileReader("data.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            
            String line;
            int lineNumber = 1;
            
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println("Line " + lineNumber + ": " + line);
                lineNumber++;
            }
            
            bufferedReader.close();
            System.out.println("✓ File read successfully!");
            
        } catch (IOException e) {
            System.out.println("❌ Error reading file: " + e.getMessage());
        }
    }
    
    // Method 3: Append to file (add without deleting existing content)
    public static void appendToFile() {
        try {
            FileWriter writer = new FileWriter("data.txt", true);  // true = append mode
            
            writer.write("This is a new line appended!\n");
            writer.write("Another appended line!\n");
            
            writer.close();
            System.out.println("✓ Data appended successfully!");
            
        } catch (IOException e) {
            System.out.println("❌ Error appending to file: " + e.getMessage());
        }
    }
    
    // Method 4: Check if file exists
    public static void checkFile() {
        File file = new File("data.txt");
        
        if (file.exists()) {
            System.out.println("✓ File exists!");
            System.out.println("File name: " + file.getName());
            System.out.println("File size: " + file.length() + " bytes");
            System.out.println("Can read: " + file.canRead());
            System.out.println("Can write: " + file.canWrite());
        } else {
            System.out.println("❌ File does not exist!");
        }
    }
}
