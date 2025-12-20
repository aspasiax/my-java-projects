package gr.aueb.cf.cf9.part1pop.ch8;

import java.util.Scanner;

/**
 * Demonstrates how to prevent {@link NumberFormatException} using Regular Expressions.
 */
public class NumberExceptionApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = "";
        int num = 0;

        System.out.print("Please enter an integer: ");

        // We combine reading and validating in the loop condition.
        // If isInteger returns false, we print an error and the loop continues.
        while (!isInteger(inputStr = scanner.nextLine())) {
            System.out.println("Error: '" + inputStr + "' is not a valid integer.");
            System.out.print("Please enter an integer: ");
        }

        num = Integer.parseInt(inputStr);
        System.out.println("Success! Number: " + num);
    }

    /**
     * Checks if a string represents a valid integer format.
     *
     * @param s the string to check
     * @return true if string matches integer pattern, false otherwise
     */
    public static boolean isInteger(String s) {
        if (s == null) return false;

        // Regex Explanation:
        // -?      : Zero or one minus sign
        // [0-9]+  : One or more digits
        return s.matches("-?[0-9]+");
    }
}