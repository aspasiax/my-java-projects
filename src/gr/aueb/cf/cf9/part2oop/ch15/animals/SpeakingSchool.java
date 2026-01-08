package gr.aueb.cf.cf9.part2oop.ch15.animals;

/**
 * Represents a School that is Tightly Coupled to a specific implementation.
 * This class creates its own dependencies (`new Cat()`).
 * It cannot be tested easily with other animals (e.g., Dog) without changing the code.
 */
public class SpeakingSchool {

    // Tightly coupled
    private final Cat cat = new Cat();    // composition, private instance

    public SpeakingSchool() {}

    public void learnToSpeak() {
        cat.speak();
    }
}
