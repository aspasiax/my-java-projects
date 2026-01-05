package gr.aueb.cf.cf9.part2oop.ch11;

/**
 * Represents a 2D Point.
 * This class is Immutable. Its state cannot be changed after instantiation.
 * It has no setter methods and fields are declared {@code final}.
 */
public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

//    public void setX(int x) {
//        this.x = x;
//    }

    public int getY() {
        return y;
    }

//    public void setY(int y) {
//        this.y = y;
//    }
}
