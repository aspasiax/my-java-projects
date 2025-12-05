package gr.aueb.cf.cf9.part1pop.ch2;

import java.util.Scanner;

/**
 * Reads day, month, and year as integers from the user
 * and displays the date in the format DD/MM/YY.
 * Example: Input 11 2 2025 -> Output 11/02/25
 */
public class DateApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = 0;
        int month = 0;
        int year = 0;

        System.out.print("Please insert three integers for day, month, year: ");
        day = scanner.nextInt();
        month = scanner.nextInt();
        year = scanner.nextInt();

        year %= 100;

        System.out.printf("Date: %02d/%02d/%02d%n", day, month, year);
    }
}

