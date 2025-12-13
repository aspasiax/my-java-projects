package gr.aueb.cf.cf9.part1pop.ch6;

import java.util.Arrays;

/**
 * Demonstrates treating Arrays as Collections using Functional-style operations.
 * Filtering: Selecting elements based on a condition (Predicate).
 * Mapping: Transforming elements (e.g., doubling values).
 * Reduction: Aggregating elements to a single value (Sum, Avg).
 * Predicates: Boolean queries (Any, All, Exists).
 */
public class ArraysAsCollections {

    public static void main(String[] args) {
        int[] arr = { 1, 5, 2, 4, 8, 9, 15, 6 };

        // 1. Filtering
        int[] evens = filterEven(arr);
        System.out.println("Evens (Method 1): " + Arrays.toString(evens));

        int[] evens2 = filterEvenTwoPass(arr);
        System.out.println("Evens (Method 2): " + Arrays.toString(evens2));

        // 2. Mapping
        int[] doubled = mapToDouble(arr);
        System.out.println("Doubled Values:   " + Arrays.toString(doubled));

        // 3. Reduction
        System.out.println("Sum: " + sum(arr));
        System.out.printf("Average: %.2f%n", avg(arr));

        // 4. Predicates
        System.out.println("Any even? " + anyEven(arr));
        System.out.println("All even? " + allEven(arr));
        System.out.println("More than 2 evens? " + moreThanTwoEvens(arr));
    }

    /**
     * Filters even numbers using a two-pass approach.
     * Pass 1: Count elements.
     * Pass 2: Populate new array.
     */
    public static int[] filterEvenTwoPass(int[] arr) {
        if (arr == null || arr.length == 0) return new int[0];

        // Pass 1: Count
        int count = 0;
        for (int el : arr) {
            if (el % 2 == 0) count++;
        }

        // Create exact size array
        int[] out = new int[count];
        int pivot = 0;

        // Pass 2: Populate
        for (int el : arr) {
            if (el % 2 == 0) {
                out[pivot++] = el;
            }
        }
        return out;
    }

    /**
     * Filters even numbers using a one-pass approach with Arrays.copyOf.
     * This is often cleaner but creates a temporary larger array.
     */
    public static int[] filterEven(int[] arr) {
        if (arr == null || arr.length == 0) return new int[0];

        int[] temp = new int[arr.length];
        int count = 0;

        for (int el : arr) {
            if (el % 2 == 0) {
                temp[count++] = el;
            }
        }
        // Truncate the array to the actual count of even numbers
        return Arrays.copyOf(temp, count);
    }

    /**
     * Maps each element to its double (x * 2).
     */
    public static int[] mapToDouble(int[] arr) {
        if (arr == null) return new int[0];

        int[] mapped = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            mapped[i] = arr[i] * 2;
        }
        return mapped;
    }

    public static int sum(int[] arr) {
        if (arr == null) return 0;
        int sum = 0;
        for (int el : arr) {
            sum += el;
        }
        return sum;
    }

    public static double avg(int[] arr) {
        if (arr == null || arr.length == 0) return 0.0;
        return sum(arr) / (double) arr.length;
    }

    public static boolean anyEven(int[] arr) {
        if (arr == null) return false;
        for (int el : arr) {
            if (el % 2 == 0) return true; // Short-circuit
        }
        return false;
    }

    public static boolean allEven(int[] arr) {
        if (arr == null) return false;
        for (int el : arr) {
            if (el % 2 != 0) return false; // Short-circuit
        }
        return true;
    }

    public static boolean moreThanTwoEvens(int[] arr) {
        if (arr == null) return false;
        int count = 0;
        for (int el : arr) {
            if (el % 2 == 0) count++;
            if (count > 2) return true; // Optimization: Early exit
        }
        return false;
    }
}
