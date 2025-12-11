package gr.aueb.cf.cf9.part1pop.ch5;

import java.math.BigDecimal;

/**
 * Demonstrates accurate floating-point arithmetic using the BigDecimal class.
 * BigDecimal is essential for financial calculations where precision is critical
 * and rounding errors (like those seen in floats/doubles) are unacceptable.
 */

public class BigDecimalApp {

    public static void main(String[] args) {
        // Initialize BigDecimals using String to ensure absolute precision
        BigDecimal actual = new BigDecimal("0.0");
        BigDecimal expected = new BigDecimal("1.0");

        for (int i = 1; i <= 10; i++) {
            actual = actual.add(new BigDecimal("0.1"));
        }

        System.out.println("Actual:   " + actual);
        System.out.println("Expected: " + expected);

        // Comparison Logic
        if (actual.equals(expected)) {
            System.out.println("Result: Equal");
        } else {
            System.out.println("Result: Not Equal");
        }
    }
}
