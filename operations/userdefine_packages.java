package Java_code.operations;

import java.util.Scanner;
import operations.sum;

public class userdefine_packages{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        sum sumObj = new sum(); 

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        int result = sumObj.add(num1, num2);
        System.out.println("Sum: " + result);

        scanner.close();
    }
}
