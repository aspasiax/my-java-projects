package gr.aueb.cf.cf9.part1pop.ch4;

/**
 * Prints all even numbers within the range [1, 20].
 * This application demonstrates the use of the modulo operator (%)
 * inside a for loop to filter and display only the even integers.
 */

public class EvenNumbers {

    public static void main(String[] args) {
        System.out.println("Even Numbers from 1 to 20");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
