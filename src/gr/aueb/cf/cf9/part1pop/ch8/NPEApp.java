package gr.aueb.cf.cf9.part1pop.ch8;

/**
 * Demonstrates the NullPointerException (NPE) and how to avoid it.
 * NPE: Occurs when we try to access a method or field of a reference
 * that points to null (no object).
 * Fix: Always check for null before using the object.
 */
public class NPEApp {

    public static void main(String[] args) {
        String s;

        s = getOneOrNull();

        // Defensive Programming (State-Test)
        // We check if s is null before asking for its length.
        if (s == null) {
            System.out.println("Result: s is null (cannot calculate length)");
            return; // Stop execution here to avoid crash
        }

        // If we reach this line, we are 100% sure s is not null.
        System.out.println("String length: " + s.length());
    }

    /**
     * Returns a String or null.
     */
    public static String getOneOrNull() {
        // Simulating a case where data might be missing
        return null;
    }
}