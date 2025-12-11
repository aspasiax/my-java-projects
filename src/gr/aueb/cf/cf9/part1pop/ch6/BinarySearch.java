package gr.aueb.cf.cf9.part1pop.ch6;

/**
 * Demonstrates the Binary Search algorithm using Recursion.
 * Binary Search finds the position of a target value within a sorted array.
 *
 * @author AUEB Coding Factory
 * @version 1.0
 */
public class BinarySearch {

    public static void main(String[] args) {
        // The array MUST be sorted for Binary Search to work.
        int[] arr = { 0, 2, 5, 8, 12, 17, 24, 32, 45, 99 };
        int value = 17;
        int position;
        int low = 0;
        int high = arr.length - 1;

        position = binarySearch(arr, value, low, high);

        if (position == -1) {
            System.out.printf("Value %d was not found in the array.%n", value);
        } else {
            System.out.printf("Value %d found at index %d.%n", value, position);
        }
    }

    /**
     * Searches for a value in a sorted array using the Divide and Conquer strategy.
     *
     * @param arr   the sorted input array
     * @param value the value to search for
     * @param low   the lower index bound
     * @param high  the upper index bound
     * @return      the index of the value if found, otherwise -1
     */
    public static int binarySearch(int[] arr, int value, int low, int high) {
        // Validation for null array
        if (arr == null) return -1;

        // Validation for bounds (sanity check)
        if (low < 0 || high > arr.length - 1) return -1;

        // Element not found (pointers crossed)
        if (low > high) return -1;

        // Calculate middle index
        int mid = (low + high) / 2;

        // Check if the middle element is the target
        if (arr[mid] == value) return mid;

        // Recursive Steps
        if (value > arr[mid]) {
            // Target is in the right half
            return binarySearch(arr, value, mid + 1, high);
        } else {
            // Target is in the left half (value < arr[mid])
            return binarySearch(arr, value, low, mid - 1);
        }
    }
}
