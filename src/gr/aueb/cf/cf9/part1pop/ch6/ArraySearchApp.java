package gr.aueb.cf.cf9.part1pop.ch6;

import java.util.Scanner;

/**
 * Demonstrates Linear Search in an array.
 * Linear Search iterates through the array sequentially to find a specific value.
 * Time Complexity: O(n) - In the worst case, we traverse the entire array.
 */

public class ArraySearchApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = { 11, 22, 33, 40, 50, 61, 70, 18, 18, 143 };
        int value = 0;
        int position = -1;

        System.out.println("Please enter the value to search for: ");
        value = scanner.nextInt();

        position = getPosition(arr, value);

        if (position == -1) {
            System.out.println("Value not found in the array.");
        } else {
            // We add 1 to the position for user-friendly output (1-based index)
            System.out.printf("Value %d found at position %d (index %d).%n",
                    value, (position + 1), position);
        }
    }

    /**
     * Approach 1: Single Return Point (Structured Programming).
     * Iterates until found, stores the index, breaks the loop, and returns at the end.
     *
     * @param arr   the input array
     * @param value the value to search for
     * @return      the index of the element, or -1 if not found
     */
    public static int getPosition(int[] arr, int value) {
        if (arr == null) return -1;

        int positionToReturn = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                positionToReturn = i;
                break; // Stop searching once found
            }
        }
        return positionToReturn;
    }

    /**
     * Approach 2: Early Return (Modern / Clean Code).
     * Returns immediately as soon as the element is found.
     *
     * @param arr   the input array
     * @param value the value to search for
     * @return      the index of the element, or -1 if not found
     */
    public static int getPositionV2(int[] arr, int value) {
        if (arr == null) return -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i; // Found it! Return immediately.
            }
        }
        // If the loop finishes without returning, the value wasn't found.
        return -1;
    }
}
