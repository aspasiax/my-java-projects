package gr.aueb.cf.cf9.part1pop.ch7;

/**
 * Demonstrates the immutability of Strings in Java.
 * Strings are stored in the String Constant Pool (SCP) for memory efficiency.
 * Once created, a String object cannot be modified.
 */
public class StrImmutable {

    public static void main(String[] args) {
        // str1 points to "Coding" in the String Constant Pool
        String str1 = "Coding";

        // str2 points to the SAME object "Coding" in the SCP
        String str2 = "Coding";

        // This does NOT change the object "Coding".
        // Instead, a new object "Factory" is created in the SCP,
        // and str2 is updated to point to this new object.
        str2 = "Factory";

        // str1 still points to the original "Coding"
        System.out.println(str1);

        // str2 now points to "Factory"
        System.out.println(str2);
    }
}
