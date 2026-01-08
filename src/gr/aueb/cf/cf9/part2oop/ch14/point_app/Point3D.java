package gr.aueb.cf.cf9.part2oop.ch14.point_app;

/**
 * Represents a 3-Dimensional Point (x, y, z).
 * Extends {@link Point2D}.
 */
public class Point3D extends Point2D {
    private double z;

    public Point3D() {
//        super();       // constructor chaining
//        this.z = 0.0;
    }

    public Point3D(double x, double y, double z) {
        super(x, y);   // Delegates to Point2D constructor
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public void movePlusOne() {
        super.movePlusOne();  // Updates x and y
        z += 1;               // Update z
    }

    @Override
    protected void movePlus10() {
        super.movePlus10();
        z += 10;
    }

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + z + ")";
    }
}
