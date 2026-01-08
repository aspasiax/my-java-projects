package gr.aueb.cf.cf9.part2oop.ch15.animals;

/**
 * Represents a School that demonstrates <b>Dependency Injection (DI).
 * This class depends on the Abstraction ({@link ISpeakable}),
 * not on concrete classes (Cat, Dog).
 * The dependency is "injected" via the constructor.
 */
public class GenericSpeakingSchool {
    private final ISpeakable iSpeakable;

    /**
     * Constructor Injection.
     * IoC - Inversion of Control
     * @param iSpeakable any entity that implements ISpeakable. Cannot be null.
     */
    public GenericSpeakingSchool(ISpeakable iSpeakable) {
        this.iSpeakable = iSpeakable;
    }

    public void speak() {
        iSpeakable.speak();
    }
}
