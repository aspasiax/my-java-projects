package gr.aueb.cf.cf9.part2oop.ch13;

import java.util.Random;

/**
 * Demonstrates Static Factory Methods.
 * Instead of exposing public constructors, we provide static methods
 * that return instances. This allows meaningful names (e.g. getRandomPoint).
 */
public class Point {
    private int x;
    private int y;

    private Point() {}

    private Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Static Factory method
     * @return
     */
    public static Point getPoint() {
        return new Point();
    }

    public static Point getRandomPoint() {
        final int BOUND = 100;
        Random random = new Random(System.nanoTime());

        //max - 1 + 1
        return new Point(random.nextInt(BOUND - 1 + 1) + 1, random.nextInt(BOUND - 1 + 1) + 1);
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
}
