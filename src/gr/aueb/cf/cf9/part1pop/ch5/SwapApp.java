package gr.aueb.cf.cf9.part1pop.ch5;

/**
 * Demonstrates the concept of Pass-by-Value in Java.
 * This application attempts to swap two integer variables using a method.
 * Because Java passes primitive types by value (copy), the modification
 * inside the swap method affects only the local parameters,
 * NOT the original variables in the caller method (main).
 */
public class SwapApp {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.printf("Before swap: a = %d, b = %d%n", a, b);

        // Call the swap method
        swap(a, b);

        // Observe that 'a' and 'b' remain unchanged here
        System.out.printf("After swap:  a = %d, b = %d%n", a, b);
    }

    /**
     * Swaps the values of two integers locally.
     * This change is local to this method's scope.
     *
     * @param a the first integer
     * @param b the second integer
     */
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
