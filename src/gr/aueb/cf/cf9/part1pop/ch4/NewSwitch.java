package gr.aueb.cf.cf9.part1pop.ch4;

import java.util.Scanner;

/**
 * Evaluates a student's grade using the Enhanced Switch statement.
 * This class demonstrates the modern syntax of the switch construct, utilizing:
 * Arrow operator (->): Eliminates the need for explicit break statements.
 * Multiple labels: Allows comma-separated values in a single case.
 */
public class NewSwitch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade = 0;

        System.out.println("Please enter a grade (1-10):");
        grade = scanner.nextInt();

        // Enhanced Switch Syntax
        switch (grade) {
            case 1, 2, 3, 4 -> System.out.println("Fail");
            case 5, 6 -> System.out.println("Good");
            case 7, 8 -> System.out.println("Very Good");
            case 9, 10 -> System.out.println("Excellent");
            default -> System.out.println("Error: Grade must be between 1 and 10.");
        }
    }
}
