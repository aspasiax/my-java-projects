package gr.aueb.cf.cf9.part1pop.ch7;

/**
 * Traverses a string character by character.
 * Uses a standard for-loop (index-based), not an enhanced for-loop.
 */
public class StrTraverse {

    public static void main(String[] args) {
        String str = "Coding Factory";

        // Forward Traversal (0 to length-1)
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }

        System.out.println();

        // Reverse Traversal (length-1 to 0)
        // We start at length() - 1 because indices are 0-based.
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i) + " ");
        }
    }
}
