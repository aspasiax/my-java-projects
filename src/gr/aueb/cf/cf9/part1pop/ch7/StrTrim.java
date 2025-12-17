package gr.aueb.cf.cf9.part1pop.ch7;

import java.util.Scanner;

/**
 * Demonstrates removing whitespace using trim().
 * Method Chaining: calling a method immediately on the result of another method.
 * scanner.nextLine() returns a String -> we immediately call .trim() on that String.
 */
public class StrTrim {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstname = "";

        System.out.println("Please enter your firstname: ");

        // 1. scanner.nextLine() reads the input
        // 2. .trim() is called on that result
        // 3. The final "clean" string is assigned to firstname
        firstname = scanner.nextLine().trim();

        // We use single quotes to visualize that there are no spaces left
        System.out.printf("Trimmed value: '%s'\n", firstname);
    }
}