package gr.aueb.cf.cf9.part2oop.ch14.point_app;

/**
 * Represents a 1-Dimensional Point.
 * Acts as the superclass for higher dimension points.
 */
public class Point {
    private double x;

    public Point() {}

    public Point(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void movePlusOne() {
        x += 1;
    }

    /**
     * Moves the point by 10 units.
     * Defined as protected to allow access/override by subclasses.
     */
    protected void movePlus10() {
        x += 10;
    }

    private void reset() {
        x = 0;
    }

    @Override
    public String toString() {
        return "(" + x + ")";
    }
}
