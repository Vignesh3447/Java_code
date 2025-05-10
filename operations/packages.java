package Java_code.operations;
import java.util.Scanner;

public class packages{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        
        if (num2 != 0) {
            System.out.println("Division: " + (num1 / num2));
        } else {
            System.out.println("Division by zero is not allowed.");
        }
        
        System.out.println("Power (num1^num2): " + Math.pow(num1, num2));
        System.out.println("Square root of first number: " + Math.sqrt(num1));
        System.out.println("Square root of second number: " + Math.sqrt(num2));
        
        scanner.close();
    }
}
