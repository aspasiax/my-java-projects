package gr.aueb.cf.cf9.part1pop.ch6;

/**
 * Demonstrates the Selection Sort algorithm.
 * Iterate through the array from i = 0 to length-1.
 * For each position i, find the smallest element in the sub-array [i, length-1].
 * Swap that smallest element with the element at position i.
 * Time Complexity: O(n^2) - due to nested loops.
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };

        System.out.println("Original Array:");
        printArray(arr);

        // Sort the array in-place
        selectionSort(arr);

        System.out.println("\nSorted Array:");
        printArray(arr);
    }

    /**
     * Sorts an integer array in ascending order using Selection Sort.
     *
     * @param arr the array to sort
     */
    public static void selectionSort(int[] arr) {
        if (arr == null) return;

        // Outer loop: Moves the boundary of the sorted subarray
        for (int i = 0; i < arr.length - 1; i++) {

            // Assume the current position i is the minimum
            int minPosition = i;
            int minValue = arr[minPosition];

            // Inner loop: Find the actual minimum in the remaining unsorted array
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < minValue) {
                    minValue = arr[j];
                    minPosition = j;
                }
            }

            // Swap the found minimum element with the first element of the unsorted part
            swap(arr, minPosition, i);
        }
    }

    /**
     * Swaps two elements in an array.
     *
     * @param arr the array
     * @param i   the index of the first element
     * @param j   the index of the second element
     */
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * Helper method to print the array.
     *
     * @param arr the input array
     */
    public static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
