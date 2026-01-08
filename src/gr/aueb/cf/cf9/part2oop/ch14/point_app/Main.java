package gr.aueb.cf.cf9.part2oop.ch14.point_app;

public class Main {

    public static void main(String[] args) {
        // Static type: Point, Runtime type: Point
        Point p1 = new Point(15.8);

        // Static type: Point, Runtime type: Point2D (Upcasting / Polymorphism)
        Point p2 = new Point2D(2, 5.5);

        // Static type: Point, Runtime type: Point3D
        Point p3 = new Point3D(2, 5.5, 10);

        // Basic calls
        p1.movePlusOne();
        p2.movePlus10();   // Will call Point2D's implementation
        p3.movePlusOne();  // Will call Point3D's implementation

        // Demonstrating Polymorphism via Method Parameters
        doMovePlus10(p1);
        doMovePlus10(p2);
        doMovePlus10(p3);

        System.out.println("\nState After Moves:");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println("\nPolymorphic toString: ");
        doPrint(p1);
        doPrint(p2);
        doPrint(p3);
    }

    /**
     * Accepts any object that IS-A Point (including Point2D, Point3D).
     * This demonstrates Late Binding: The JVM decides at runtime which
     * version of movePlus10() to execute.
     */
    public static void doMovePlus10(Point p) {
        p.movePlus10();       // late binding
    }

    public static void doPrint(Point p) {
        System.out.println(p);   // Calls p.toString() polymorphically
    }
}
