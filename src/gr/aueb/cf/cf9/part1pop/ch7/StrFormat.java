package gr.aueb.cf.cf9.part1pop.ch7;

/**
 * Demonstrates how to format primitives into Strings using String.format().
 * %c: Character
 * %d: Decimal (Integer)
 * %02d: Integer with 2 digits width, padded with leading zeros.
 */
public class StrFormat {

    public static void main(String[] args) {
        char row = 'A';
        int col = 3;

        // "Template": %c%02d
        // 1st arg (row) replaces %c -> 'A'
        // 2nd arg (col) replaces %02d -> '03' (pads with 0 because width is 2)
        String seat = String.format("%c%02d", row, col);

        System.out.println("Seat Number: " + seat);
    }
}