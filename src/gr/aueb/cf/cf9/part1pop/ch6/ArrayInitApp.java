package gr.aueb.cf.cf9.part1pop.ch6;

/**
 * Demonstrates the different ways to declare and initialize Arrays in Java.
 * Method 1 (new type[size]): Creates an array with default values (0 for int).
 * Method 2 (Unsized Initialization): Shorthand syntax, valid only during declaration.
 * Method 3 (Array Initializer): Explicit syntax, useful for re-assigning arrays.
 */
public class ArrayInitApp {

    public static void main(String[] args) {
        // Method 1: Declaration and Allocation with fixed size
        // When we know the size but not the values yet.
        int[] arr1 = new int[3]; // All elements are initialized to 0 (default for int)

        // Populate specific indices
        arr1[0] = 5;
        arr1[2] = 10;
        // arr1[1] remains 0

        System.out.println("Method 1: ");
        System.out.println("arr1[0]: " + arr1[0]);
        System.out.println("arr1[1]: " + arr1[1]); // Prints default value 0
        System.out.println("arr1[2]: " + arr1[2]);


        // Method 2: Shorthand Initialization (Unsized)
        // When we know the values upfront.
        // Valid ONLY at the moment of declaration.
        int[] arr2 = { 1, 2, 3, 4, 5 };

        System.out.println("\nMethod 2: ");
        System.out.println("First element: " + arr2[0]);
        System.out.println("Last element:  " + arr2[arr2.length - 1]);
        System.out.println("Length: " + arr2.length);


        // Method 3: Array Initializer with 'new'
        // Necessary if we separate declaration from initialization
        // or if we want to return an array from a method without a variable.
        int[] arr3;
        // arr3 = { 1, 2, 3 }; // Compile Error! Shorthand not allowed here.
        arr3 = new int[] { 10, 20, 30, 40, 50 };

        System.out.println("\nMethod 3: ");
        System.out.println("arr3[0]: " + arr3[0]);
    }
}
