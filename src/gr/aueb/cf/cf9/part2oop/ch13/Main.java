package gr.aueb.cf.cf9.part2oop.ch13;

public class Main {

    public static void main(String[] args) {
        // 1. Utility Class
        HelloUtil.sayHello();

        // 2. Static Factory Method
        Point p = Point.getRandomPoint();
        System.out.println("Random Point: " + p.getX() + ", " + p.getY());

        // 3. Singleton (Eager) Test
        OnlyOneCodingFactory eager1 = OnlyOneCodingFactory.getInstance();
        OnlyOneCodingFactory eager2 = OnlyOneCodingFactory.getInstance();

        // Έλεγχος αν δείχνουν στην ίδια θέση μνήμης
        System.out.println("Eager instances are the same: " + (eager1 == eager2));
        eager1.sayHello();

        // 4. Singleton (Lazy) Test
        OnlyOneCodingLazy lazy1 = OnlyOneCodingLazy.getInstance();
        OnlyOneCodingLazy lazy2 = OnlyOneCodingLazy.getInstance();

        System.out.println("Lazy instances are the same: " + (lazy1 == lazy2));
        lazy1.sayHello();
    }
}
