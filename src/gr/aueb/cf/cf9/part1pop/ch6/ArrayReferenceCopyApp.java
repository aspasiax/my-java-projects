package gr.aueb.cf.cf9.part1pop.ch6;

/**
 * Demonstrates Reference Copy (Aliasing) in arrays.
 * When we assign one array variable to another, we are NOT creating a copy of the array's elements.
 * Instead, we are copying the memory address (reference).
 * Both variables now point to the same object in the Heap.
 * Modifying one will instantly affect the other.
 */

public class ArrayReferenceCopyApp {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        // Reference Copy (Shallow Copy of the reference)
        // arrRef is just an alias for arr.
        int[] arrRef = arr;

        System.out.println("Original arr[0]: " + arr[0]);

        // Modify the array using the second reference
        arrRef[0] = 1000;

        System.out.println("\nAfter Modification: ");
        System.out.println("arrRef[0] is: " + arrRef[0]);
        System.out.println("arr[0] is:    " + arr[0] + " (CHANGED!)");
    }
}
