package gr.aueb.cf.cf9.part1pop.ch3;

import java.util.Scanner;

/**
 * Reads an integer temperature from the user
 * and checks whether it is below zero.
 * The program assigns true if the temperature
 * is less than 0, otherwise false.
 */
public class TemperatureApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temperature = 0;
        boolean isTempBelowZero = false;

        System.out.println("Please enter a temperature: ");
        temperature = scanner.nextInt();

        isTempBelowZero = (temperature < 0);

        System.out.println("Is the temperature below zero? " + isTempBelowZero);
    }
}
