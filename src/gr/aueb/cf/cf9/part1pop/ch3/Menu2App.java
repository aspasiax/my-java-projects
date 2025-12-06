package gr.aueb.cf.cf9.part1pop.ch3;

import java.util.Scanner;

/**
 * Repeatedly displays a menu until the user selects 'Exit' (option 3).
 * This implementation uses a while(true) loop (infinite loop)
 * and controls the termination flow using a break statement
 * when the exit condition is met.
 */

public class Menu2App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (true) {
            System.out.println("Please select one of the following:");
            System.out.println("1. Insert Request");
            System.out.println("2. Delete Request");
            System.out.println("3. Exit");

            choice = scanner.nextInt();

            if (choice == 3) {
                break;
            }
        }

        System.out.println("Thanks for using the program");
    }
}
