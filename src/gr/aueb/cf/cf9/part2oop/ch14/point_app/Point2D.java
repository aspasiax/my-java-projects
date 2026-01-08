package gr.aueb.cf.cf9.part2oop.ch14.point_app;

/**
 * Represents a 2-Dimensional Point (x, y).
 * Extends {@link Point}.
 */
public class Point2D extends Point {
    private double y;

    public Point2D() {
//        By default:
//        super();
//        y = 0.0;
    }

    public Point2D(double x, double y) {
        super(x);    // Initialize parent state
        this.y = y;
    }

    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }

    @Override
    public void movePlusOne() {
        super.movePlusOne();   // Update x
        y += 1;                // Update y
    }

    @Override
    protected void movePlus10() {
        super.movePlus10();
        y += 10;
    }

    @Override
    public String toString() {
        // Use getX() because x is private in the parent class
        return "(" + getX() + ", " + y + ")";
    }
}
