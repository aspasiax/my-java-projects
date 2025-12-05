package gr.aueb.cf.cf9.part1pop.ch2;

import java.util.Scanner;

/**
 * Converts a user input temperature from Fahrenheit to Celsius.
 * Formula used: Celsius = 5 * (Fahrenheit - 32) / 9
 * Example: If the user enters 212°F, the output will be 100°C.
 */
public class FahrenheitToCelsius {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fahrenheit = 0;
        int celsius = 0;

        System.out.println("Please enter the temperature in Fahrenheit: ");
        fahrenheit = scanner.nextInt();

        celsius = 5 * (fahrenheit - 32) / 9;

        System.out.printf("%d°F is %d°C%n", fahrenheit, celsius);
    }
}
