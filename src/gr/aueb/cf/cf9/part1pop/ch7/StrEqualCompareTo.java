package gr.aueb.cf.cf9.part1pop.ch7;

/**
 * Demonstrates String comparison in Java.
 * == operator: Checks for Reference Equality (do they point to the same address?).
 * .equals(): Checks for Semantic Equality (do they have the same characters?).
 * .compareTo(): Checks for Lexicographical (Alphabetical) Order.
 */
public class StrEqualCompareTo {

    public static void main(String[] args) {
        String str1 = "Athens";                 // SCP (String Constant Pool)
        String str2 = "athens";                 // SCP
        String str3 = "ATHENS";                 // SCP
        String str4 = new String("Athens");     // Heap (New Object)
        String str5 = "Athens";                 // SCP (Points to existing "Athens")

        // Equality Check (== vs .equals)

        // '==' compares references (memory addresses)
        boolean equals1 = str1 == str2;  // false (Different objects, different text)
        boolean equals2 = str1 == str4;  // false (One in SCP, one in Heap)
        boolean equals3 = str1 == str5;  // true  (Both point to the same SCP object)

        // .equals() compares content (values)
        boolean equals4 = str1.equals(str2);   // false (Case differs: 'A' != 'a')
        boolean equals5 = str1.equals(str4);   // true  (Content is identical)
        boolean equals6 = str1.equals(str5);   // true  (Content is identical)

        // Case-insensitive comparison
        boolean equals7 = str1.equalsIgnoreCase(str2);  // true

        System.out.println("str1 equals str5 (==): " + equals3);
        System.out.println("str1 equals str4 (content): " + equals5);

        // Lexicographical Comparison (Sorting)

        // compareTo returns:
        // < 0 if str1 comes before str2
        // > 0 if str1 comes after str2
        // 0 if they are equal

        // "Athens" vs "athens": 'A' (65) is less than 'a' (97), so result is negative.
        if (str1.compareTo(str2) > 0) {
            System.out.println("str1 > str2");
        } else if (str1.compareTo(str2) < 0) {
            System.out.println("str1 < str2"); // This will print
        } else {
            System.out.println("str1 == str2");
        }

        // compareToIgnoreCase ("Athens" vs "athens") -> Equal
        if (str1.compareToIgnoreCase(str2) > 0) {
            System.out.println("str1 > str2");
        }  else if (str1.compareToIgnoreCase(str2) < 0) {
            System.out.println("str1 < str2");
        }  else {
            System.out.println("str1 == str2");
        }
    }
}