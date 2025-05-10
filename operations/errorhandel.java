// This is a simple error handling example in Java

import java.util.Scanner;

public class errorhandel {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("enter a secound number: ");
        int b = scanner.nextInt();
        int c;
        
        // example of error handling

        try {
            c = a / b; // This will cause an ArithmeticException
            System.out.println("Result: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            System.out.println("Execution completed.");
        }
    }
    // This is a simple error handling example in Java
}
