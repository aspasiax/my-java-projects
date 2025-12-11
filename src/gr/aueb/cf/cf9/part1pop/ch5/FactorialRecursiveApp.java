package gr.aueb.cf.cf9.part1pop.ch5;

import java.util.Scanner;

/**
 * Calculates the factorial of a number using Recursion.
 * Recursion involves a method calling itself to solve a smaller instance of the problem.
 * It consists of two main parts:
 * Base Case: The condition that stops the recursion (e.g., n <= 1).
 * Recursive Step: The logic where the method calls itself (e.g., n * facto(n-1)).
 */

public class FactorialRecursiveApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int factorial = 0;

        System.out.println("Please enter an integer: ");
        num = scanner.nextInt();

        factorial = facto(num);

        System.out.println(num + "! = " + factorial);
    }

    /**
     * Recursive method to calculate n!.
     *
     * @param n the number to calculate the factorial of
     * @return the factorial of n
     */
    public static int facto(int n) {
        // If n <= 1 (Base Case), return 1.
        // Otherwise (Recursive Step), return n * facto(n - 1).
        return (n <= 1) ? 1 : n * facto(n - 1);
    }
}
