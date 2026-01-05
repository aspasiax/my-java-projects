package gr.aueb.cf.cf9.part2oop.ch13;

/**
 * Singleton Design Pattern (Eager Initialization).
 *  * The instance is created immediately when the class is loaded.
 */
public class OnlyOneCodingFactory {

    private final static OnlyOneCodingFactory instance = new OnlyOneCodingFactory();

    private OnlyOneCodingFactory() {}

    public static OnlyOneCodingFactory getInstance() {
        return instance;
    }

    public void sayHello() {
        System.out.println("Hello from Eager Singleton!");
    }
}
