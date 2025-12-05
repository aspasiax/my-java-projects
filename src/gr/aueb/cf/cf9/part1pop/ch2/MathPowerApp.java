package gr.aueb.cf.cf9.part1pop.ch2;

import java.util.Scanner;

/**
 * Reads an integer from the user and calculates its square and cube.
 * Demonstrates the use of {@link Math#pow(double, double)} for exponentiation.
 */
public class MathPowerApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;

        System.out.println("Please enter a number:");
        num = in.nextInt();

        int square = (int) Math.pow(num, 2);
        int cube = (int) Math.pow(num, 3);

        System.out.printf("The square of %d is %d.%n", num, square);
        System.out.printf("The cube of %d is %d.%n", num, cube);
    }
}

