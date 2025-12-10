package gr.aueb.cf.cf9.part1pop.ch5;

/**
 * Demonstrates the Floating Point Representation Error.
 * Standard floating-point numbers cannot exactly represent simple decimals like 0.1.
 * Consequently, repeated arithmetic operations accumulate small errors,
 * making strict equality checks (==) unreliable.
 */

public class RepresentationErrorApp {

    public static void main(String[] args) {
        double actual = 0.0;
        double expected = 1.0;

        // Add 0.1 ten times. Mathematically, the result should be 1.0.
        for (int i = 1; i <= 10; i++) {
            actual += 0.1;
        }

        // Display the values with high precision to reveal the error
        System.out.printf("Expected: %.20f%n", expected);
        System.out.printf("Actual:   %.20f%n", actual);

        // Strict comparison (Will likely fail)
        if (actual == expected) {
            System.out.println("Result: Equal (Success)");
        } else {
            System.out.println("Result: Not equal (Failure)");
        }

        // Correct way to compare (using a small epsilon)
        final double EPSILON = 1e-9;
        if (Math.abs(actual - expected) < EPSILON) {
            System.out.println("CORRECT CHECK: They are effectively equal.");
        }
    }
}
