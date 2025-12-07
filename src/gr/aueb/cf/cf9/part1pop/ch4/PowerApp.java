package gr.aueb.cf.cf9.part1pop.ch4;

import java.util.Scanner;

/**
 * Calculates the power of a base raised to an exponent (a^b).
 * The application reads two integers from the user: the base and the power.
 * It then calculates the result using an iterative multiplication process.
 * Note: This implementation assumes non-negative integer exponents.
 * If power is 0, the result is  1.
 */

public class PowerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 1;

        System.out.println("Please enter base and power: ");
        base = scanner.nextInt();
        power = scanner.nextInt();

        for (int i = 1; i <= power; i++) {
            result *= base;
        }

        System.out.printf("Result: %d ^ %d = %d%n", base, power, result);
    }
}
