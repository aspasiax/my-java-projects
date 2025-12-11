package gr.aueb.cf.cf9.part1pop.ch6;

/**
 * Demonstrates finding the Minimum and Maximum elements in an array.
 * The algorithm traverses the array once (Time Complexity O(n)).
 * It assumes the first element (index 0) is the min/max and compares
 * it with the rest of the elements.
 */

public class ArrayMinMaxApp {

    public static void main(String[] args) {
        int[] arr = { 30, 12, 80, 7, 15, 25 };

        int minPosition = getMinPosition(arr);
        int maxPosition = getMaxPosition(arr);

        // Display Minimum
        if (minPosition != -1) {
            System.out.printf("Min value: %d, Position: %d (Index: %d)%n",
                    arr[minPosition], minPosition + 1, minPosition);
        } else {
            System.out.println("Min: Array is empty or null.");
        }

        // Display Maximum
        if (maxPosition != -1) {
            System.out.printf("Max value: %d, Position: %d (Index: %d)%n",
                    arr[maxPosition], maxPosition + 1, maxPosition);
        } else {
            System.out.println("Max: Array is empty or null.");
        }
    }

    /**
     * Finds the index of the minimum element.
     *
     * @param arr the input array
     * @return the index of the minimum element, or -1 if array is invalid
     */
    public static int getMinPosition(int[] arr) {
        if (arr == null || arr.length == 0) return -1;

        int minPosition = 0;
        int minValue = arr[minPosition];

        // Start checking from the second element (index 1)
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }
        return minPosition;
    }

    /**
     * Finds the index of the maximum element.
     *
     * @param arr the input array
     * @return the index of the maximum element, or -1 if array is invalid
     */
    public static int getMaxPosition(int[] arr) {
        if (arr == null || arr.length == 0) return -1;

        int maxPosition = 0;
        int maxValue = arr[maxPosition];

        // Start checking from the second element (index 1)
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[i];
            }
        }
        return maxPosition;
    }
}
