package gr.aueb.cf.cf9.part1pop.ch6;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Checks a set of 6 numbers (1-49) against common Lottery Filters (Predicates).
 * Filters applied:
 * Max 3 Evens
 * Max 3 Odds
 * Max 3 Consecutive numbers
 * Max 3 numbers with the same ending digit
 * Max 3 numbers in the same decade
 */
public class LottoApp {

    // Constant to avoid "Magic Numbers"
    private static final int LIMIT = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[6];

        System.out.println("Please enter 6 distinct numbers (1-49):");

        // Input loop with basic validation
        for (int i = 0; i < numbers.length; i++) {
            int num;
            do {
                System.out.print("Number " + (i + 1) + ": ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Invalid input. Please enter an integer.");
                    scanner.next(); // Consume invalid input
                }
                num = scanner.nextInt();
            } while (num < 1 || num > 49);
            numbers[i] = num;
        }

        // Sorting is required for the 'Consecutive' check to work linearly.
        Arrays.sort(numbers);
        System.out.println("Sorted Numbers: " + Arrays.toString(numbers));

        // Evaluate filters
        System.out.println("\nEvaluation Results: ");
        System.out.printf("Pass 'Max 3 Evens':       %b%n", hasAtMost3Evens(numbers));
        System.out.printf("Pass 'Max 3 Odds':        %b%n", hasAtMost3Odds(numbers));
        System.out.printf("Pass 'Max 3 Consecutive': %b%n", hasAtMost3Consecutive(numbers));
        System.out.printf("Pass 'Max 3 Same Ending': %b%n", hasAtMost3SameEnding(numbers));
        System.out.printf("Pass 'Max 3 Same Decade': %b%n", hasAtMost3SameDecade(numbers));
    }

    /**
     * Predicate: Checks if there are at most 3 even numbers.
     */
    public static boolean hasAtMost3Evens(int[] arr) {
        int count = 0;
        for (int n : arr) {
            if (n % 2 == 0) count++;
        }
        return count <= LIMIT;
    }

    /**
     * Predicate: Checks if there are at most 3 odd numbers.
     */
    public static boolean hasAtMost3Odds(int[] arr) {
        int count = 0;
        for (int n : arr) {
            if (n % 2 != 0) count++;
        }
        return count <= LIMIT;
    }

    /**
     * Predicate: Checks if there are at most 3 consecutive numbers.
     * Expects a sorted array.
     */
    public static boolean hasAtMost3Consecutive(int[] arr) {
        int streak = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1] + 1) {
                streak++;
                if (streak > LIMIT) return false;
            } else {
                streak = 1; // Reset streak if strictly consecutive sequence breaks
            }
        }
        return true;
    }

    /**
     * Predicate: Checks if there are at most 3 numbers with the same last digit.
     * Uses a frequency array (bucket sort logic).
     */
    public static boolean hasAtMost3SameEnding(int[] arr) {
        int[] endings = new int[10]; // Indices 0-9 represent the endings

        for (int n : arr) {
            // e.g., 42 % 10 = 2. Increment bucket at index 2.
            endings[n % 10]++;
        }

        // Check if any bucket exceeds the limit
        for (int count : endings) {
            if (count > LIMIT) return false;
        }
        return true;
    }

    /**
     * Predicate: Checks if there are at most 3 numbers in the same decade.
     * Decades: 0-9, 10-19, 20-29, 30-39, 40-49.
     */
    public static boolean hasAtMost3SameDecade(int[] arr) {
        int[] decades = new int[5]; // 5 decades for numbers up to 49

        for (int n : arr) {
            // Integer division maps: 1-9 -> 0, 10-19 -> 1, etc.
            decades[n / 10]++;
        }

        for (int count : decades) {
            if (count > LIMIT) return false;
        }
        return true;
    }
}
