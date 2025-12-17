package gr.aueb.cf.cf9.part1pop.ch7;

/**
 * Demonstrates String case conversion (Uppercase / Lowercase).
 * This technique is often used for Normalization before comparison.
 * Since Strings are immutable, toUpperCase() returns a new string.
 */
public class StrUpperLower {

    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = "athens";

        // 1. Convert to Lowercase
        String lower = s1.toLowerCase();
        System.out.println("Original: " + s1 + " -> Lower: " + lower);

        // 2. Convert to Uppercase
        String upper = s2.toUpperCase();
        System.out.println("Original: " + s2 + " -> Upper: " + upper);

        // 3. Equality Check with Normalization
        // We convert both to uppercase to check if they contain the same letters
        boolean isEqual = s1.toUpperCase().equals(s2.toUpperCase());

        // This is equivalent to:
        boolean isEqualBuiltIn = s1.equalsIgnoreCase(s2);

        System.out.println("\nComparison: ");
        System.out.println("Manual Upper check: " + isEqual);
        System.out.println("equalsIgnoreCase:   " + isEqualBuiltIn);
    }
}