package gr.aueb.cf.cf9.part1pop.ch2;

import java.util.Scanner;

/**
 * Demonstrates reading two integers from the keyboard (standard input)
 * and calculating their sum.
 * Uses {@link Scanner} to read user input from the console.
 */
public class AddScannerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int sum = 0;

        System.out.println("Please enter two integers: ");
        // Read two integers from the user
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        sum = num1 + num2;

        System.out.printf("The sum of %d and %d is %d%n", num1, num2, sum);
    }
}

