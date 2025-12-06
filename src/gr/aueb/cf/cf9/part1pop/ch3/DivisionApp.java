package gr.aueb.cf.cf9.part1pop.ch3;

import java.util.Scanner;

/**
 * Calculates the quotient of two integers iteratively.
 * The user inputs a numerator and a denominator. The application computes
 * the integer division result.
 * If the numerator is 0, the application terminates.</li>
 * If the denominator is 0, the application displays an error
 * message and skips the current iteration.
 */
public class DivisionApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        while (true) {
            System.out.println("Please enter a numerator (0 for exit): ");
            numerator = scanner.nextInt();

            if (numerator == 0) {
                System.out.println("Numerator is 0. Quitting...");
                break;
            }

            System.out.println("Please enter a denominator: ");
            denominator = scanner.nextInt();

            if (denominator == 0) {
                System.out.println("Error: Cannot divide by zero.");
                continue;  // Skips the division and restarts the loop
            }

            result = numerator / denominator;
            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}
