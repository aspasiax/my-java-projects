package gr.aueb.cf.cf9.part1pop.ch5;
/**
 * Demonstrates Method Overloading.
 * Method Overloading occurs when a class has multiple methods with the:
 * Same Name: (e.g., 'add')
 * Different Parameters: Different type, number, or order of parameters.
 * The return type is NOT part of the method signature. Therefore,
 * you cannot overload a method simply by changing its return type.
 */

public class MethodOverloading {

    public static void main(String[] args) {
        int sum1 = 0;
        int sum3 = 0;
        long sum2 = 0L;

        sum1 = add(10, 20);           // Calls add(int, int)
        sum2 = add(10L, 20L);         // Calls add(long, long)
        sum3 = add(10, 20, 30);       // Calls add(int, int, int)

        System.out.println("Sum1 (int, int): " + sum1);
        System.out.println("Sum2 (long, long): " + sum2);
        System.out.println("Sum3 (int, int, int): " + sum3);
    }

    /**
     * Adds two integers.
     *
     * @param num1 the first integer
     * @param num2 the second integer
     * @return the sum
     */
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * Adds two long integers.
     *
     * @param num1 the first long
     * @param num2 the second long
     * @return the sum
     */
    public static long add(long num1, long num2) {
        return num1 + num2;
    }

    /**
     * Adds three integers.
     *
     * @param num1 the first integer
     * @param num2 the second integer
     * @param num3 the third integer
     * @return the sum
     */
    public static int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
}
