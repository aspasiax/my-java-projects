package gr.aueb.cf.cf9.part1pop.ch6;

/**
 * Demonstrates how to create a Deep Copy of an integer array.
 * A deep copy creates a completely new array object in memory (Heap) and copies
 * the values from the source array. As a result, the two arrays are independent.
 * Modifying one does NOT affect the other.
 */

public class ArrayDeepCopyApp {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] arrCopy;

        // Create a fresh copy
        arrCopy = getDeepCopy(arr);

        // Modify the copy
        System.out.println("Modifying copy's first element to 1000...");
        arrCopy[0] = 1000;

        // Verify independence
        System.out.println("Original array [0]: " + arr[0] + " (Unchanged)");
        System.out.println("Copy array [0]:     " + arrCopy[0]);
    }

    /**
     * Creates a deep copy of the input array.
     *
     * @param source the source array to copy
     * @return a new array containing the same values as the source
     */
    public static int[] getDeepCopy(int[] source) {
        // Safety check
        if (source == null) return null;

        // 1. Allocate new memory
        int[] destination = new int[source.length];

        // 2. Copy elements one by one
        for (int i = 0; i < source.length; i++) {
            destination[i] = source[i];
        }

        return destination;
    }
}
