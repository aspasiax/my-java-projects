package gr.aueb.cf.cf9.part1pop.ch5;

import java.util.Scanner;

/**
 * Calculates the power of an integer (base^power) using a custom method.
 * This class demonstrates defining a method with multiple parameters
 * and a return value.
 */

public class PowerMethodApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 0;

        System.out.println("Please enter base and power: ");
        base = scanner.nextInt();
        power = scanner.nextInt();

        result = pow(base, power);

        System.out.println(base + " ^ " + power + " = " + result);
    }

    /**
     * Calculates base raised to the power of n.
     *
     * @param base  the base number
     * @param power the exponent
     * @return the result of base^power
     */
    public static int pow(int base, int power) {
        int result = 1;

        for (int i = 1; i <= power; i++) {
            result *= base;
        }

        return result;
    }
}
