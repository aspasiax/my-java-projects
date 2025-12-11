package gr.aueb.cf.cf9.part1pop.ch6;

/**
 * Demonstrates representing large integers using arrays and performing arithmetic.
 * We have a large integer represented as an array of digits.
 * Goal: Add 1 to this number.
 * Edge Case: If all digits are 9 (e.g., 99 + 1 = 100), the array size must increase by 1.
 * This implementation creates a new array of size n+1 to handle potential overflow safely.
 */
public class AddOneApp {

    public static void main(String[] args) {
        int[] arr = { 9, 9, 9 };
        int[] arr2 = { 1, 9 };

        System.out.println("Input: 999");
        printArray(addOne(arr)); // Expected: 1 0 0 0

        System.out.println("\nInput: 19");
        printArray(addOne(arr2)); // Expected: 0 2 0
    }

    /**
     * Adds one to the integer represented by the input array.
     *
     * @param arr the input array representing the number
     * @return a new array representing the result (size is arr.length + 1)
     */
    public static int[] addOne(int[] arr) {
        if (arr == null) return new int[0];

        // Create a new array with one extra slot for potential carry overflow
        int[] arrOut = new int[arr.length + 1];
        int sum = 0;
        int carry = 1; // We start with a carry of 1 because we are adding 1

        // Traverse the array backwards (from units to tens, hundreds, etc.)
        for (int i = arr.length - 1; i >= 0; i--) {
            sum = arr[i] + carry;

            // Current digit is sum % 10 (e.g., 10 % 10 = 0)
            // We store it at i + 1 because arrOut is 1 slot larger
            arrOut[i + 1] = sum % 10;

            // Update carry
            carry = sum / 10;
        }

        // If there is a remaining carry after the loop, place it at the front
        if (carry == 1) {
            arrOut[0] = 1;
        }

        return arrOut;
    }

    public static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
