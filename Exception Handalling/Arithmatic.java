import java.util.*;

public class Arithmatic {
    public static void main(String[] args) {
        int num1 = 10, num2 = 0;

        // Exception handling
        try {
            int result = num1 / num2; // Risky code
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed!");
        }

        // Remaining code
        System.out.println("Program continues...");
    }

}