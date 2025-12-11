package gr.aueb.cf.cf9.part1pop.ch6;

/**
 * Demonstrates swapping values using an Array.
 * Unlike primitive types (int, double), arrays are Reference Types>.
 * When passing an array to a method, we pass a copy of the reference (memory address).
 * Consequently, modifications to the array's elements inside the method
 * are reflected in the original array in the caller method (main).
 */
public class SwapWithArray {

    public static void main(String[] args) {
        int[] arr = { 1, 10 };

        System.out.println("Before Swap:");
        printArray(arr);

        swap(arr);

        System.out.println("\nAfter Swap:");
        printArray(arr);
    }

    /**
     * Swaps the first two elements of the array.
     *
     * @param arr the input array
     */
    public static void swap(int[] arr) {
        // Validation: Ensure array is not null and has at least 2 elements
        if (arr == null || arr.length < 2) {
            return;
        }

        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }

    /**
     * Helper method to print array elements.
     * @param arr the array to print
     */
    public static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
