package gr.aueb.cf.cf9.part1pop.ch7;

import java.util.Scanner;

/**
 * Demonstrates Typecasting (Parsing) between Strings and Primitives.
 * Integer.parseInt(str): String -> int
 * String.valueOf(num): int -> String
 */
public class StrTypecast {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lexeme = "";
        int num = 0;

        System.out.println("Please enter an integer: ");

        // Reading line and then parsing
        lexeme = scanner.nextLine();

        // 1. String -> int (Parsing)
        num = Integer.parseInt(lexeme);

        System.out.println("The number is: " + num);

        // 2. int -> String (Type conversion)
        String str1 = String.valueOf(num);

        System.out.println("Back to String: " + str1);
    }
}