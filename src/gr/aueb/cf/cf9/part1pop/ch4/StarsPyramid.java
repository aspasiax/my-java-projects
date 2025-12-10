package gr.aueb.cf.cf9.part1pop.ch4;

/**
 * Prints a symmetric pyramid of stars based on a fixed number of levels.
 */

public class StarsPyramid {

    public static void main(String[] args) {
        final int LEVELS = 10;

        // Outer loop: Controls the number of rows (levels)
        for (int i = 1; i <= LEVELS; i++) {

            // 1st Inner loop: Prints leading spaces (padding)
            // Logic: As 'i' increases, spaces decrease.
            for (int j = LEVELS - i; j >= 1; j--) {
                System.out.print(" ");
            }

            // 2nd Inner loop: Prints stars
            // Logic: Calculates odd numbers (1, 3, 5...) using formula 2*i - 1
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Move to the next line after printing spaces and stars for the current row
            System.out.println();
        }
    }
}
