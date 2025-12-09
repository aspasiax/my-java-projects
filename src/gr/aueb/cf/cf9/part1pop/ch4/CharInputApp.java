package gr.aueb.cf.cf9.part1pop.ch4;

import java.io.IOException;

/**
 * Demonstrates reading a single character using the raw System.in.read() method.
 * Unlike Scanner, System.in.read() reads bytes directly from the standard input stream.
 * It reads one byte at a time and returns its integer representation.
 * This method throws an IOException, which must be handled
 * or declared in the method signature.
 */

public class CharInputApp {

    public static void main(String[] args) throws IOException {
        int inputChar = ' ';

        System.out.println("Please enter an ASCII character:");

        // It returns the byte value as an int (0-255).
        inputChar = System.in.read();

        System.out.println("Char: " + (char) inputChar);
    }
}