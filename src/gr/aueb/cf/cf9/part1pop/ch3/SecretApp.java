package gr.aueb.cf.cf9.part1pop.ch3;

import java.util.Scanner;

/**
 * A simple guessing game where the user tries to find a secret number.
 * The user provides a single input integer.
 * The application checks if the input matches the pre-defined SECRET
 * constant and displays a success or failure message accordingly.
 */

public class SecretApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SECRET = 76;
        int num = 0;

        System.out.println("Please guess the secret number: ");
        num = scanner.nextInt();

        if (num == SECRET) {
            System.out.println("Success! You found the secret number!");
        } else {
            System.out.println("Sorry, that is not the secret number.");
        }

        scanner.close();
    }
}
