package gr.aueb.cf.cf9.part1pop.ch8;

import java.util.Scanner;

/**
 * Demonstrates State-Testing (Validation) instead of Exception Handling.
 * Instead of letting the error happen and catching it (try-catch),
 * we check the condition (state) beforehand.
 * This is much faster and is considered best practice for predictable errors.
 */
public class Arithmetic3App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        while (true) {
            System.out.println("Please enter two integers (numerator, denominator). Enter 0 as numerator to exit:");

            num1 = scanner.nextInt();

            // Exit condition
            if (num1 == 0) {
                System.out.println("Goodbye!");
                break;
            }

            num2 = scanner.nextInt();

            // State-Testing (Validation)
            // We check if the denominator is zero before dividing.
            // This prevents the ArithmeticException from ever being created.
            if (num2 == 0) {
                System.out.println("Error: Denominator cannot be zero. Please try again.");
                continue; // Skip the rest of the loop and start over
            }

            result = num1 / num2;
            System.out.println("The result is: " + result);
        }
    }
}