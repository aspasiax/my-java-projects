package gr.aueb.cf.cf9.part1pop.challenges;

/**
 * Finds a missing number in a sequence from 1 to N+1.
 * 1. Calculate the expected sum of numbers from 1 to (arr.length + 1).
 * n * (n + 1) / 2
 * 2. Calculate the actual sum of the array elements.
 * 3. The difference is the missing number.
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class MissingElement {

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 5};

        int missing = findMissingElement(input);
        System.out.println("The missing element is: " + missing);
    }

    public static int findMissingElement(int[] arr) {
        if (arr == null || arr.length == 0) return -1;
        long n = arr.length + 1;

        long expectedSum = (n * (n + 1)) / 2;
        long actualSum = 0;

        for (int item : arr) {
            actualSum += item;
        }

        return (int) (expectedSum - actualSum);
    }
}
