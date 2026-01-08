package gr.aueb.cf.cf9.part2oop.ch15.animals;

/**
 * Functional Interface representing any entity capable of producing sound.
 * This acts as the Contract for our system.
 */
@FunctionalInterface
public interface ISpeakable {

    /**
     * Makes the entity produce its sound.
     */
    public abstract void speak();
}