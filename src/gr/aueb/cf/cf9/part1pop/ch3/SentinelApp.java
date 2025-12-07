package gr.aueb.cf.cf9.part1pop.ch3;

import java.util.Scanner;

/**
 * Demonstrates the usage of a Sentinel Value to control loop termination.
 * The application iteratively reads integers from standard input.
 * It continues to run until the user inputs a specific "sentinel" value (-1),
 * which signals the end of the process.
 */

public class SentinelApp {

    /**
     * The main entry point of the application.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int iterations = 0;

        System.out.println("Please enter a number (-1 to exit):");
        num = scanner.nextInt();

        while (num != -1) {
            iterations++;

            System.out.println("Please enter a number (-1 to exit):");
            num = scanner.nextInt();
        }

        System.out.printf("Total iterations performed: %d%n", iterations);
    }
}