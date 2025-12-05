package gr.aueb.cf.cf9.part1pop.ch2;

import java.util.Locale;
import java.util.Scanner;

/**
 * Converts a user's input in hours to minutes and seconds.
 * Example: If the user enters 1 hour, the program will output 60 minutes and 3600 seconds.
 */
public class HoursToMinSec {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int HOURS_TO_MINUTES = 60;
        final int HOURS_TO_SECONDS = 3600;
        int hours = 0;
        int minutes = 0;
        int seconds = 0;

        System.out.println("Please enter the number of hours: ");
        hours = scanner.nextInt();

        minutes = hours * HOURS_TO_MINUTES;
        seconds = hours * HOURS_TO_SECONDS;

        System.out.printf(Locale.US, "%d hours are %d minutes%n", hours, minutes);
        System.out.printf(Locale.forLanguageTag("el"), "%d hours are %,d seconds%n", hours, seconds);
    }
}

