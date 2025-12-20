package gr.aueb.cf.cf9.part1pop.ch8;

/**
 * Demonstrates the {@link ArrayIndexOutOfBoundsException}.
 * Common Cause: Off-by-One Error.
 * Arrays are 0-indexed. If length is 5, valid indices are 0 to 4.
 * Accessing index 5 causes a Runtime Exception.
 */
public class IndexOutOfBoundsExceptionApp {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        // Using '<=' instead of '<'
        // When i becomes 5, the loop runs one last time.
        for (int i = 0; i <= arr.length; i++) {

            System.out.print("Index " + i + ": ");

            // Crash happens here when i == 5
            System.out.println(arr[i]);
        }

        // THE FIX
        /*
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        */
    }
}