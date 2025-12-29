package gr.aueb.cf.cf9.part1pop.challenges;

import java.io.*;
import java.util.Arrays;

/**
 * Calculates and displays character frequency statistics from a file.
 * Uses a 2D Array where:
 * - Col 0: The ASCII code of the character.
 * - Col 1: The frequency (count) of the character.
 * This allows O(1) access time to update counts.
 */
public class CharStatisticsApp {

    public static void main(String[] args) {
        String filename = "src/gr/aueb/cf/cf9/part1pop/challenges/textFile.txt";

        // Standard ASCII table
        int[][] stats = new int[128][2];

        // Init the array: Col 0 stores the Char Code, Col 1 stores Count (0)
        for (int i = 0; i < 128; i++) {
            stats[i][0] = i;
            stats[i][1] = 0;
        }

        // 1. READ & COUNT
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            int charCode;
            while ((charCode = br.read()) != -1) {
                // Check if it fits in our array and ignore whitespace
                if (charCode < 128 && !Character.isWhitespace(charCode)) {
                    stats[charCode][1]++;
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return;
        }

        // 2. REPORTING

        // A. Sorted by Character (Implicitly sorted by index 0)
        System.out.println("Statistics by Character (ASCII order): ");
        printStats(stats);

        // B. Sorted by Frequency (Descending)
        // Make a copy to preserve the original array structure if needed elsewhere
        int[][] sortedByFreq = Arrays.copyOf(stats, stats.length);

        Arrays.sort(sortedByFreq, (row1, row2) -> Integer.compare(row2[1], row1[1]));

        System.out.println("\nStatistics by Frequency (Descending): ");
        printStats(sortedByFreq);
    }

    /**
     * Prints the statistics table.
     * Skips characters with 0 occurrences.
     */
    public static void printStats(int[][] table) {
        System.out.printf("%-10s %-10s\n", "Char", "Count");
        for (int[] row : table) {
            if (row[1] > 0) {
                System.out.printf("%-10c %-10d\n", (char) row[0], row[1]);
            }
        }
    }
}
