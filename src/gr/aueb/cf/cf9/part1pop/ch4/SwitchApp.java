package gr.aueb.cf.cf9.part1pop.ch4;

import java.util.Scanner;

/**
 * Demonstrates a menu-driven application using the {@code switch} statement.
 * <p>
 * The user selects an option based on an integer input. The {@code switch}
 * construct routes the execution to the corresponding case block.
 * A {@code do-while} loop ensures the menu reappears until the user selects 'Exit'.
 */
public class SwitchApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        final int EXIT = 4;

        do {
            System.out.println("Please select one of the following:");
            System.out.println("1. One-player game");
            System.out.println("2. Two-player game");
            System.out.println("3. Team game");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Starting one-player game...");
                    break; // Essential to prevent falling through to the next case
                case 2:
                    System.out.println("Starting two-player game...");
                    break;
                case 3:
                    System.out.println("Starting team game...");
                    break;
                case 4: // Matches the EXIT value
                    System.out.println("Exiting...");
                    break;
                default:
                    // Executed if none of the above cases match
                    System.out.println("Invalid choice. Please select between 1-4.");
                    break;
            }
        } while (choice != EXIT);

        System.out.println("Goodbye!");
    }
}
