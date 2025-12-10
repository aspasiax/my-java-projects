package gr.aueb.cf.cf9.part1pop.ch5;

/**
 * Displays detailed information about Floating Point data types (float, double).
 * This application prints the range, size (in bits and bytes), and limits
 * of Java's floating-point primitive types.
 * Note using scientific notation (e.g., 1.40e-45)
 */

public class FloatingPointApp {

    public static void main(String[] args) {
        System.out.printf("Type: Float  | Size: %d bytes (%d bits) | Min: %.2e  | Max: %.2e\n", Float.BYTES, Float.BYTES * 8, Float.MIN_VALUE, Float.MAX_VALUE);
        System.out.printf("Type: Double | Size: %d bytes (%d bits) | Min: %.2e | Max: %.2e\n", Double.BYTES, Double.BYTES * 8, Double.MIN_VALUE, Double.MAX_VALUE);

    }
}

