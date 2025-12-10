package gr.aueb.cf.cf9.part1pop.ch4;

/**
 * Calculates the sum of integers from 1 to 50.
 * This simple application uses a for loop to accumulate the sum
 * of all integers in the closed range [1, 50].
 */

public class SumIntegers {

    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 50; i++) {
            sum += i;
        }

        System.out.println("The sum of integers from 1 to 50 is: " + sum);
    }
}
