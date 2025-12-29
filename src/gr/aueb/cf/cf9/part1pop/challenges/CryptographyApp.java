package gr.aueb.cf.cf9.part1pop.challenges;

import java.util.ArrayList;
import java.util.List;

/**
 * Implements a Chained Substitution Cipher.
 * Cipher[i] = (Plain[i] + Cipher[i-1]) % KEY
 * Decipher[i] = (Cipher[i] - Cipher[i-1] + KEY) % KEY
 * This dependency on the previous character makes the encryption
 * context-sensitive and stronger than simple substitution.
 */
public class CryptographyApp {

    public static void main(String[] args) {
        String s = "Coding Factory#";
        final int KEY = 256; // Standard ASCII size

        System.out.println("Original: " + s);

        // Encryption
        String encrypted = cipher(s, KEY);
        System.out.println("Encrypted (Int Sequence): " + encrypted);

        // Decryption
        String decrypted = decipher(encrypted, KEY);
        System.out.println("Decrypted: " + decrypted);
    }

    /**
     * Encrypts a string into a sequence of space-separated integers.
     * Stops if it encounters the '#' character.
     *
     * @param s   the string to encrypt
     * @param key the modulo base (usually 256)
     * @return the encrypted string of numbers
     */
    public static String cipher(String s, int key) {
        if (s == null || s.isEmpty()) return "";

        StringBuilder sb = new StringBuilder();
        int prevCipher;
        int currentCipher;

        // Init: Process the first character (no previous cipher exists)
        prevCipher = s.charAt(0);
        sb.append(prevCipher).append(" ");

        // Loop starting from 2nd character
        for (int i = 1; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Sentinel check: stop at #
            if (ch == '#') {
                sb.append("-1");
                break;
            }

            // Core Formula: (Current Char + Previous Encrypted Value) % Key
            currentCipher = (ch + prevCipher) % key;

            sb.append(currentCipher).append(" ");

            // Update previous cipher for the next iteration
            prevCipher = currentCipher;
        }

        return sb.toString().trim();
    }

    /**
     * Decrypts a sequence of integers back to the original string.
     *
     * @param s   the space-separated integers string
     * @param key the modulo base
     * @return the decrypted text
     */
    public static String decipher(String s, int key) {
        if (s == null || s.isEmpty()) return "";

        StringBuilder sb = new StringBuilder();
        String[] tokens = s.split(" ");

        // Use logic for the first character
        int prevCipher = Integer.parseInt(tokens[0]);
        sb.append((char) prevCipher);

        for (int i = 1; i < tokens.length; i++) {
            int currentCipher = Integer.parseInt(tokens[i]);

            // Check for sentinel value
            if (currentCipher == -1) {
                // Optionally append '#' if we want strict restoration
                // sb.append("#");
                break;
            }

            // Core Formula: (Current Cipher - Previous Cipher)
            // We add + KEY before modulo to handle negative results from subtraction.
            int decryptedChar = (currentCipher - prevCipher + key) % key;

            sb.append((char) decryptedChar);

            // Update previous cipher
            prevCipher = currentCipher;
        }

        return sb.toString();
    }
}
