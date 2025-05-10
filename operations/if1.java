package Java_code.operations;
import java.util.Scanner;

class if1 {
    public static void main(String[] args) {
        
        Scanner get = new Scanner(System.in);

        
        System.out.println("Enter the two number: ");
        double number1 = get.nextDouble();
        double number2 = get.nextDouble();

        if (number1 > number2) {
            System.out.println(number1 + " is greater than " + number2);
        } else if (number1 < number2) {
            System.out.println(number1 + " is less than " + number2);
        } else {
            System.out.println(number1 + " is equal to " + number2);
        }
        get.close();
    }
}
