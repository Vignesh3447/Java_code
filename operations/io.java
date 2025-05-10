package Java_code.operations;
import java.util.Scanner;

public class io {
    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Display the input to the user
        System.out.println("Hello, " + name + "!");
        System.out.println("brooshlee");

        // Close the scanner
        scanner.close();
    }
}
