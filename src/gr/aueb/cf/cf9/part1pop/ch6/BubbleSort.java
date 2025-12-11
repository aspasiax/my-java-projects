package gr.aueb.cf.cf9.part1pop.ch6;

/**
 * Demonstrates the Bubble Sort algorithm.
 * Repeatedly swaps adjacent elements if they are in the wrong order.
 * In each pass, the largest unsorted element "bubbles up" to its correct position at the end.
 * Time Complexity: O(n^2) - Average and Worst case.
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = { 10, 5, 2, 8, 7 };

        System.out.println("Original Array:");
        printArray(arr);

        bubbleSort(arr);

        System.out.println("\nSorted Array:");
        printArray(arr);
    }

    /**
     * Sorts an array using the Bubble Sort algorithm.
     *
     * @param arr the array to sort
     */
    public static void bubbleSort(int[] arr) {
        if (arr == null) return;

        // Outer loop: Runs backwards from the end.
        // After each iteration, the element at index 'i' is sorted (locked).
        for (int i = arr.length - 1; i > 0; i--) {

            // Inner loop: Compares adjacent elements up to 'i'.
            for (int j = 0; j < i; j++) {

                // Swap if left element > right element
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    /**
     * Swaps two elements in an array.
     *
     * @param arr the array
     * @param i   first index
     * @param j   second index
     */
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * Helper method to print the array.
     * @param arr the array to print
     */
    public static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
