package gr.aueb.cf.cf9.part1pop.ch3;

import java.util.Scanner;

/**
 * Determines whether the car's lights should be turned on based on environmental conditions.
 * The logical rule is as follows:
 * Lights turn on if it is raining AND at least one of the following is true:
 * It is dark or
 * The car is running fast (speed > 100 km/h).
 */

public class LightsOnApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRaining = false;
        boolean isDark = false;
        boolean isRunning = false;
        int speed = 0;
        final int SPEED_THRESHOLD = 100;
        boolean lightsOn = false;

        System.out.println("Please enter if it is raining (true/false):");
        isRaining = scanner.nextBoolean();

        System.out.println("Please enter if it is dark (true/false):");
        isDark = scanner.nextBoolean();

        System.out.println("Please enter the car's speed (int):");
        speed = scanner.nextInt();

        isRunning = speed > SPEED_THRESHOLD;

        lightsOn = isRaining && (isDark || isRunning);

        System.out.println("Lights On status: " + lightsOn);
    }
}
