package gr.aueb.cf.cf9.part1pop.ch8;

import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * Simulates a simple Bank Application with Deposit and Withdraw features.
 * Demonstrates:
 * 1. Throwing Exceptions manually.
 * 2. Logging and Re-throwing Exceptions.
 */
public class BankApp {
    static double balance = 100.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        double amount = 0.0;

        System.out.println("Current Balance: " + balance);
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.print("Please select an option: ");

        // Basic validation for choice could be added here
        if (scanner.hasNextInt()) {
            choice = scanner.nextInt();
        }

        try {
            if (choice == 1) {
                System.out.println("Enter deposit amount:");
                amount = scanner.nextDouble();

                deposit(amount);

                System.out.println("Success! New Balance: " + balance);

            } else if (choice == 2) {
                System.out.println("Enter withdraw amount:");
                amount = scanner.nextDouble();

                withdraw(amount);

                System.out.println("Success! New Balance: " + balance);
            } else {
                System.out.println("Invalid choice.");
            }

        } catch (Exception e) {
            // Main handles the User Interface (UI) part
            // It prints a friendly message, not the stack trace.
            System.out.println("Error: " + e.getMessage());
        }
    }

    /**
     * Deposits money.
     * @throws Exception if amount is negative.
     */
    public static void deposit(double amount) throws Exception {
        try {
            if (amount < 0) {
                throw new Exception("Deposit amount cannot be negative.");
            }
            balance += amount;

        } catch (Exception e) {
            // Logging
            System.err.println("[LOG " + LocalDateTime.now() + "] Error in deposit: " + e.getMessage());

            // Re-throw
            throw e;
        }
    }

    /**
     * Withdraws money.
     * @throws Exception if amount is negative OR insufficient funds.
     */
    public static void withdraw(double amount) throws Exception {
        try {
            if (amount < 0) {
                throw new Exception("Withdraw amount cannot be negative.");
            }
            if (amount > balance) {
                throw new Exception("Insufficient funds. Balance is: " + balance);
            }

            balance -= amount;

        } catch (Exception e) {
            // Logging
            System.err.println("[LOG " + LocalDateTime.now() + "] Error in withdraw: " + e.getMessage());

            // Re-throw
            throw e;
        }
    }
}