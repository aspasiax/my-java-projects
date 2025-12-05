package gr.aueb.cf.cf9.part1pop.ch2;

/**
 * Demonstrates generating a random integer between 1 and 6,
 * simulating a die roll.
 * Uses Math.random(), which generates a double between [0.0, 1.0),
 * then scales it to the desired range and casts to int.
 */
public class RandomApp {

    public static void main(String[] args) {
        int die = 0;

        die = (int) (Math.random() * 6) + 1;
        System.out.println("You rolled a: " + die);
    }
}

