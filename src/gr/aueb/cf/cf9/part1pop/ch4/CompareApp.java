package gr.aueb.cf.cf9.part1pop.ch4;

/**
 * Demonstrates character comparison based on Unicode code points.
 * Comparisons between characters are performed based on their underlying
 * numeric values (code points).
 * Since Greek characters reside in a higher range of the Unicode table
 * than standard ASCII (Latin) characters, they are numerically "greater".
 */

public class CompareApp {

    public static void main(String[] args) {
        char greekAlpha = 'α';  // Greek small letter Alpha
        char latinB = 'b';      // Latin small letter B
        boolean greekIsGreater = false;

        System.out.println("Comparing characters based on their integer values:");

        // Display the numeric values
        System.out.printf("Greek '%c' has code point: %d%n", greekAlpha, (int) greekAlpha);
        System.out.printf("Latin '%c' has code point: %d%n", latinB, (int) latinB);

        // Comparison logic
        if (greekAlpha > latinB) {
            greekIsGreater = true;
        }

        System.out.println("Is Greek 'α' greater than Latin 'b'? " + greekIsGreater);
    }
}