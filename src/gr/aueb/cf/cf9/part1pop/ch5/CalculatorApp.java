package gr.aueb.cf.cf9.part1pop.ch5;

import java.util.Scanner;

/**
 * A simple pocket calculator implementation demonstrating Structured Programming.
 * This application breaks down the logic into smaller, reusable methods.
 */

public class CalculatorApp {
    // Global Scanner implies it's shared across all methods in this class
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;
        final int EXIT_CHOICE = 6;
        int result = 0;

        while (true) {
            printMenu();
            choice = getOneInt();

            // Validate input range
            if (!isChoiceValid(choice)) {
                System.out.println("Error: Choice must be between 1-6.");
                continue;
            }

            // Check for exit condition
            if (choice == EXIT_CHOICE) {
                System.out.println("Exiting... Goodbye!");
                break;
            }

            // Perform calculation
            result = getResultOnChoice(choice);
            System.out.println("Result: " + result);
        }
    }

    /**
     * Displays the calculator menu.
     */
    public static void printMenu() {
        System.out.println("\n--- Calculator Menu ---");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulo");
        System.out.println("6. Exit");
        System.out.print("Please enter your choice: ");
    }

    /**
     * Reads an integer from the standard input.
     * @return the integer entered by the user.
     */
    public static int getOneInt() {
        return scanner.nextInt();
    }

    /**
     * Validates if the user choice is within the allowed range.
     * @param choice the user's input
     * @return true if choice is between 1 and 6, otherwise false
     */
    public static boolean isChoiceValid(int choice) {
        return choice >= 1 && choice <= 6;
    }

    /**
     * Orchestrates the calculation process based on the user's choice.
     * Prompts for two numbers and calls the appropriate math method.
     *
     * @param choice the operation to perform (1-5)
     * @return the result of the operation
     */
    public static int getResultOnChoice(int choice) {
        int num1 = 0;
        int num2 = 0;

        System.out.println("Please enter two integers:");
        num1 = getOneInt();
        num2 = getOneInt();

        return switch (choice) {
            case 1 -> add(num1, num2);
            case 2 -> sub(num1, num2);
            case 3 -> mul(num1, num2);
            case 4 -> div(num1, num2);
            case 5 -> mod(num1, num2);
            default -> 0; // Should not happen due to prior validation
        };
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0; // Return 0 to avoid crash, though result is technically undefined
        }
        return a / b;
    }

    public static int mod(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Modulo by zero is not allowed.");
            return 0;
        }
        return a % b;
    }
}
