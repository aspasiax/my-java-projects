package gr.aueb.cf.cf9.part1pop.ch5;

import java.util.Scanner;

/**
 * A structured application that prints various star patterns using methods.
 * This class demonstrates the decomposition of a complex problem into smaller,
 * manageable methods (Modular Programming). It includes a menu system
 * and separates input handling, validation, and output logic.
 */

public class StarsApp {
    // Global Scanner used across all static methods
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;
        final int EXIT_CHOICE = 6;

        while (true) {
            printMenu();
            choice = getOneInt();

            if (!isChoiceValid(choice)) {
                System.out.println("Error: Choice must be between 1-6.");
                continue;
            }

            if (choice == EXIT_CHOICE) {
                System.out.println("Exiting... Goodbye!");
                break;
            }

            processChoice(choice);
        }
    }

    /**
     * Displays the application menu.
     */
    public static void printMenu() {
        System.out.println("\nStar Patterns Menu");
        System.out.println("1. Horizontal Stars");
        System.out.println("2. Vertical Stars");
        System.out.println("3. Square Grid (nxn)");
        System.out.println("4. Ascending Triangle (1 to n)");
        System.out.println("5. Descending Triangle (n to 1)");
        System.out.println("6. Exit");
        System.out.print("Please select an option: ");
    }

    /**
     * Reads an integer from standard input.
     * @return the user's input integer
     */
    public static int getOneInt() {
        return scanner.nextInt();
    }

    /**
     * Validates if the choice is within the allowed range (1-6).
     * @param choice the user input
     * @return true if valid, false otherwise
     */
    public static boolean isChoiceValid(int choice) {
        return choice >= 1 && choice <= 6;
    }

    /**
     * Processes the user's validated choice by asking for 'n' and calling the appropriate method.
     * @param choice the menu option selected
     */
    public static void processChoice(int choice) {
        System.out.print("Please enter the number of stars (n): ");
        int n = getOneInt();

        System.out.println();

        switch (choice) {
            case 1 -> printStarsHorizontal(n);
            case 2 -> printStarsVertical(n);
            case 3 -> printStarGrid(n);
            case 4 -> printAscendingTriangle(n);
            case 5 -> printDescendingTriangle(n);
            default -> System.out.println("Error: Unknown operation.");
        }
    }

    public static void printStarsHorizontal(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printStarsVertical(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }
    }

    public static void printStarGrid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printAscendingTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printDescendingTriangle(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}