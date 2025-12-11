package gr.aueb.cf.cf9.part1pop.ch5;

import java.util.Scanner;

/**
 * Calculates the power of a base raised to an exponent using Recursion.
 * The recursive definition used is:
 * Base Case: if power is 0, result is 1.
 * Recursive Step: base^power = base * base^(power-1).
 * This implementation assumes non-negative exponents.
 */
public class PowerRecursiveApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 0;

        System.out.println("Please enter base and power (power must be >= 0): ");
        base = scanner.nextInt();
        power = scanner.nextInt();

        // Check to avoid StackOverflowError for negative powers
        if (power < 0) {
            System.out.println("Error: Power cannot be negative in this implementation.");
        } else {
            result = pow(base, power);
            System.out.println(base + " ^ " + power + " = " + result);
        }
    }

    /**
     * Recursively calculates base^power.
     *
     * @param base  the base number
     * @param power the exponent (must be >= 0)
     * @return the result of the exponentiation
     */
    public static int pow(int base, int power) {
        // Base Case: Any number to the power of 0 is 1.
        if (power == 0) {
            return 1;
        }

        // Recursive Step: base * (base^(power-1))
        return base * pow(base, power - 1);
    }
}
