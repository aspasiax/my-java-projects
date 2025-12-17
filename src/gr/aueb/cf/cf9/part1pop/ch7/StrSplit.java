package gr.aueb.cf.cf9.part1pop.ch7;

/**
 * Demonstrates how to split a String into tokens (words) using the split() method.
 * It uses Regular Expressions (Regex) as a delimiter.
 */
public class StrSplit {

    public static void main(String[] args) {
        // Included extra spaces to demonstrate the power of Regex " +"
        String s = "Athens University of Economics and Business";

        String[] tokens;

        // The argument inside split is a Regular Expression (Regex).
        // " +" means: split by one OR MORE space characters.
        tokens = s.split(" +");

        // Iterate through the array of tokens
        for (String token : tokens) {
            System.out.println(token);
        }
    }
}