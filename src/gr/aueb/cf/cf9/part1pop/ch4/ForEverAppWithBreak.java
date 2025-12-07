package gr.aueb.cf.cf9.part1pop.ch4;

/**
 * Demonstrates an infinite loop using the for(;;) syntax.
 * The loop runs indefinitely but terminates explicitly using a break
 * statement when a specific condition (count == MAX) is met.
 * It also demonstrates formatting output using the modulo operator.
 */

public class ForEverAppWithBreak {

    public static void main(String[] args) {
        int count = 0;
        final int MAX = 10;

        for (;;) {
            System.out.print("Forever ");
            count++;

            // Modulo operator: Print a newline every 10 iterations
            if (count % 10 == 0) System.out.println();

            // Note: Braces {} are optional for single-statement if blocks
            if (count == MAX) break;
        }
    }
}
