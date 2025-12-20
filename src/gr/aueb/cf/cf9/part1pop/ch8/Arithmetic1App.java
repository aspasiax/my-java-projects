package gr.aueb.cf.cf9.part1pop.ch8;

import java.util.Scanner;

/**
 * Demonstrates an Unchecked Exception (ArithmeticException).
 * Scenario:
 * The user enters a denominator of 0.
 * The JVM throws an ArithmeticException: / by zero.
 * Since there is no error handling, the program terminates immediately (crashes).
 */
public class Arithmetic1App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        System.out.println("Please enter two numbers (numerator, denominator): ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        // Calling the method that might throw an exception
        // If num2 is 0, the program crashes here.
        result = div(num1, num2);

        // This line is never reached if an exception occurs above.
        System.out.println("The result is: " + result);
    }

    /**
     * Performs integer division.
     * @param num1 numerator
     * @param num2 denominator
     * @return the quotient
     */
    public static int div(int num1, int num2) {
        return num1 / num2;
    }
}