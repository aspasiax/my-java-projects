package gr.aueb.cf.cf9.part1pop.ch4;

/**
 * Demonstrates the usage of <b>Surrogate Pairs</b> to represent Unicode characters
 * beyond the Basic Multilingual Plane (BMP).
 * Java's char data type is 16-bit and can store values up to 0xFFFF.
 * Characters with code points > 0xFFFF (like many Emojis) require two char
 * values (a high surrogate and a low surrogate) to be represented.
 * Example: The Grinning Face Emoji (😀) has code point 0x1F600.
 */

public class UnicodeApp {

    public static void main(String[] args) {
        // Unicode code point for "Grinning Face" emoji (U+1F600)
        // This value is larger than what a single 'char' can hold (Max 0xFFFF).
        int codePoint = 0x1F600;

        System.out.print("Smiley: ");

        // Character.toChars(int) converts the code point into a char array.
        // For 0x1F600, it returns an array of 2 chars (High Surrogate + Low Surrogate).
        System.out.println(Character.toChars(codePoint));
    }
}