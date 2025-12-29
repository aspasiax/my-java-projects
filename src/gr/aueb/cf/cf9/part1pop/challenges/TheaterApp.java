package gr.aueb.cf.cf9.part1pop.challenges;

import java.util.Scanner;

/**
 * A Theater Booking System using a 2D Array.
 * Functionality:
 * - Book a seat (Column A-L, Row 1-30).
 * - Cancel a reservation.
 * - Visual representation of the theater layout.
 * ASCII Arithmetic (char - 'A') to map letters to array indices.
 */
public class TheaterApp {

    // Constants for Maintainability
    private static final int ROWS = 30;
    private static final int COLS = 12;

    // The Data Structure: false = Empty, true = Booked
    private static boolean[][] seats = new boolean[ROWS][COLS];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;
        boolean exit = false;

        System.out.println("Theater Management System");

        while (!exit) {
            System.out.println("\nSelect an action:");
            System.out.println("1. Book a Seat");
            System.out.println("2. Cancel a Reservation");
            System.out.println("3. Show Seating Plan");
            System.out.println("4. Exit");
            System.out.print("> ");

            if (!in.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                in.next();
                continue;
            }
            choice = in.nextInt();

            switch (choice) {
                case 1:
                case 2:
                    handleBooking(in, choice == 1);
                    break;
                case 3:
                    printTheater();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please pick 1-4.");
            }
        }
        System.out.println("Thank you for using the Theater App!");
        in.close();
    }

    /**
     * Handles user input for booking or cancellation.
     * @param in Scanner object
     * @param isBooking true for booking, false for cancellation
     */
    public static void handleBooking(Scanner in, boolean isBooking) {
        System.out.print("Enter Column (A-L) and Row (1-30) e.g., 'C 5': ");

        String colStr = in.next().toUpperCase();
        if (colStr.length() != 1) {
            System.out.println("Invalid Column format.");
            return;
        }
        char colChar = colStr.charAt(0);

        if (!in.hasNextInt()) {
            System.out.println("Invalid Row format.");
            in.next();
            return;
        }
        int rowNum = in.nextInt();

        // Perform the action
        if (isBooking) {
            book(colChar, rowNum);
        } else {
            cancel(colChar, rowNum);
        }
    }

    public static void book(char column, int row) {
        int colIndex = column - 'A';
        int rowIndex = row - 1;

        if (!isValid(rowIndex, colIndex)) {
            System.out.println("Error: Seat " + column + row + " does not exist.");
            return;
        }

        if (!seats[rowIndex][colIndex]) {
            seats[rowIndex][colIndex] = true;
            System.out.println("Success: Seat " + column + row + " booked.");
        } else {
            System.out.println("Error: Seat " + column + row + " is already booked.");
        }
    }

    public static void cancel(char column, int row) {
        int colIndex = column - 'A';
        int rowIndex = row - 1;

        if (!isValid(rowIndex, colIndex)) {
            System.out.println("Error: Seat " + column + row + " does not exist.");
            return;
        }

        if (seats[rowIndex][colIndex]) {
            seats[rowIndex][colIndex] = false;
            System.out.println("Success: Reservation for " + column + row + " cancelled.");
        } else {
            System.out.println("Error: Seat " + column + row + " was not booked.");
        }
    }

    /**
     * Prints a visual map of the theater.
     * [ ] = Empty, [X] = Booked
     */
    public static void printTheater() {
        System.out.println("\n   A  B  C  D  E  F  G  H  I  J  K  L");
        for (int i = 0; i < ROWS; i++) {
            System.out.printf("%2d ", i + 1);
            for (int j = 0; j < COLS; j++) {
                System.out.print(seats[i][j] ? "[X]" : "[ ]");
            }
            System.out.println();
        }
    }

    private static boolean isValid(int row, int col) {
        return row >= 0 && row < ROWS && col >= 0 && col < COLS;
    }
}
