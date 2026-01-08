package gr.aueb.cf.cf9.part2oop.ch15.abstract_classes;

/**
 * Represents an Abstract Animal.
 * Abstract classes cannot be instantiated directly.
 * They serve as a base for concrete subclasses.
 * They can contain both abstract methods (contracts) and concrete methods (logic).
 */
public abstract class Animal {
    private long id;
    private String name;

    public Animal() {}

    public Animal(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Abstract method. Subclasses MUST implement this.
     * This acts like an Interface contract.
     */
    public abstract void speak();

    /**
     * Concrete method. Subclasses inherit this logic as is,
     * but can override it if needed.
     */
    public void eat() {
        System.out.println(name + " is eating");
    }

    @Override
    public String toString() {
        return "Animal{id: " + id + ", name: '" + name + "'}";
    }
}

