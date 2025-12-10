package gr.aueb.cf.cf9.part1pop.ch4;

import java.util.Scanner;

/**
 * Demonstrates how to read a char using the Scanner class.
 * Since Scanner does not provide a direct method to read a single character,
 * the standard approach is to read a String (using nextLine() or next())
 * and then extract the first character using charAt(0).
 */

public class CharScannerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char inputChar = ' ';

        System.out.println("Please enter a character: ");

        // Read the full line input by the user and extract the character at index 0.
        inputChar = scanner.nextLine().charAt(0);

        System.out.println("Input character: " + inputChar);
    }
}
