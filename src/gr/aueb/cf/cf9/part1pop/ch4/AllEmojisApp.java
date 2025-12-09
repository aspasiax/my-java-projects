package gr.aueb.cf.cf9.part1pop.ch4;

/**
 * Prints a list of Emojis within the Unicode range 0x1F600 - 0x1F64F.
 * Technical Background:
 * BMP (Plane 0): Characters from U+0000 to U+FFFF. These fit in a single Java char.
 * Supplementary Planes (1-16): Characters with code points > U+FFFF (like Emojis).
 * Since Java's char is 16-bit, it cannot directly store values like 0x1F600.
 * The method Character.toChars(int codePoint) solves this by converting the code point
 * into a Surrogate Pair (two char values: High and Low Surrogate) when necessary.
 */

public class AllEmojisApp {

    /**
     * The main entry point of the application.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        int emojiStart = 0x1F600; // Starting Code Point
        int emojiEnd = 0x1F64F;   // Ending Code Point
        int counter = 0;
        int currentEmoji = emojiStart;

        while (currentEmoji <= emojiEnd) {
            System.out.print(Character.toChars(currentEmoji));
            System.out.print(" "); // Space between emojis

            currentEmoji++;
            counter++;

            // Print a new line every 16 emojis for better grid formatting
            if (counter % 16 == 0) {
                System.out.println();
            }
        }
    }
}
