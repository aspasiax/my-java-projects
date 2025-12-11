package gr.aueb.cf.cf9.part1pop.ch5;

import java.util.Scanner;

/**
 * Finds the maximum of three integers using a dedicated method.
 * This application demonstrates method arguments and the usage of
 * Math.max(int, int) to simplify comparison logic.
 */

public class MaxApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        System.out.println("Please enter three integers: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();

        System.out.printf("The maximum number among %d, %d, and %d is: %d%n",
                num1, num2, num3, findMax(num1, num2, num3));
    }

    /**
     * Returns the largest of three integers.
     *
     * @param a the first integer
     * @param b the second integer
     * @param c the third integer
     * @return the maximum value
     */
    public static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}
