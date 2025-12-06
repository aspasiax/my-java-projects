package gr.aueb.cf.cf9.part1pop.ch3;

/**
 * Demonstrates special edge cases and scenarios for the while loop.
 */

public class SpecialCasesWhile {

    public static void main(String[] args) {
        int i = 1;

        // Case 1: Zero iterations
        while (i < 0) {
            System.out.println("Never gets into this loop");
            i++;
        }

        // Case 2: Exactly one iteration
        while (i <= 1) {
            System.out.println("Only one iteration");
            i++;
        }

        // Case 3: Infinite loop
        while (true) {
            System.out.println("Infinite loop");
        }
    }
}