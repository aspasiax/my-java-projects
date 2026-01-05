package gr.aueb.cf.cf9.part2oop.ch13;

/**
 * Singleton Pattern (Lazy Initialization).
 *  * The instance is created only when it is requested for the first time.
 */
public class OnlyOneCodingLazy {
    private static OnlyOneCodingLazy instance;

    private OnlyOneCodingLazy() {}

    public static OnlyOneCodingLazy getInstance() {
        if (instance == null) {
            instance = new OnlyOneCodingLazy();
        }
        return instance;
    }

    public void sayHello() {
        System.out.println("Hello from Lazy Singleton!");
    }
}
