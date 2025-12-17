package gr.aueb.cf.cf9.part1pop.ch7;

/**
 * Demonstrates String copying (Reference Copy) and Substring operations.
 * Copy: Since Strings are immutable, assigning s2 = s1 is safe.
 * It copies the reference, not the content. Modifying s2 creates a new object.
 * Substring: Extracts a portion of the string.
 */
public class StrCopySubstring {

    public static void main(String[] args) {
        // String Copy (Reference Copy)
        String s1 = "Coding";
        String s2 = s1;           // s2 points to the same object as s1

        // Because Strings are immutable, this creates a new object "Factory".
        // s1 still points to "Coding".
        s2 = "Factory";

        System.out.println("s1: " + s1); // Coding
        System.out.println("s2: " + s2); // Factory

        // Substring Methods
        String s3 = "Athens";

        // substring(i) -> returns string from index i to the end
        String sub1 = s3.substring(1);      // "thens"

        // substring(i, j) -> returns string from index i (inclusive) to j (exclusive)
        // Length of result = j - i
        String sub2 = s3.substring(1, 3);   // "th" (indices 1 and 2)

        System.out.println("\nOriginal: " + s3);
        System.out.println("Substring(1): " + sub1);
        System.out.println("Substring(1, 3): " + sub2);

        System.out.println("\nTraversing using substring:");
        traverse(s3);
    }

    /**
     * Iterates through the string and prints characters one by one.
     * charAt() is more efficient than substring() for single chars.
     *
     * @param s the input string
     */
    public static void traverse(String s) {
        for (int i = 0; i < s.length(); i++) {
            // Extract one character as a String (from i to i+1)
            System.out.print(s.substring(i, i + 1) + " ");
        }
        System.out.println();
    }
}