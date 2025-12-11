package gr.aueb.cf.cf9.part1pop.ch6;

/**
 * Demonstrates Jagged Arrays (Ragged Arrays).
 * A jagged array is an array of arrays such that member arrays can be of different sizes.
 * This is possible because each row in a Java 2D array is a separate object reference.
 */

public class JaggedArrays {

    public static void main(String[] args) {
        // Declaration: 3 rows, but columns are undefined for now
        int[][] jaggedArr = new int[3][];

        // Allocation: Each row gets a different size
        jaggedArr[0] = new int[5];  // Row 0 has 5 columns
        jaggedArr[1] = new int[3];  // Row 1 has 3 columns
        jaggedArr[2] = new int[10]; // Row 2 has 10 columns

        // Traversal using Standard For Loop
        // jaggedArr[i].length adapts to the size of each specific row
        System.out.println("Standard For Loop: ");
        for (int i = 0; i < jaggedArr.length; i++) {
            System.out.print("Row " + i + " size " + jaggedArr[i].length + ": ");
            for (int j = 0; j < jaggedArr[i].length; j++) {
                System.out.print(jaggedArr[i][j] + " ");
            }
            System.out.println();
        }

        // Traversal using Enhanced For Loop
        System.out.println("\nEnhanced For Loop: ");
        for (int[] row : jaggedArr) {
            for (int item : row) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }
}
