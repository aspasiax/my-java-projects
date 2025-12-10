package gr.aueb.cf.cf9.part1pop.ch4;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Calculates the power of a number (base^power) using {@link BigInteger}.
 * This class demonstrates how to handle very large numbers that exceed the
 * capacity of primitive data types (like int or long).
 * It manually implements the power algorithm using a loop and the
 * multiply() method.
 */
public class BigIntApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger base = BigInteger.ZERO;
        BigInteger power = BigInteger.ZERO;
        BigInteger result = BigInteger.ONE; // Initialized to 1 (multiplicative identity)

        System.out.println("Please enter the base and the power:");
        base = scanner.nextBigInteger();
        power = scanner.nextBigInteger();

        for (int i = 1; i <= power.intValue(); i++) {
            result = result.multiply(base);
        }

        System.out.printf("Result: %d^%d = %,d%n", base, power, result);
    }
}
