package gr.aueb.cf.cf9.part2oop.ch15.abstract_classes;

public class Main {

    public static void main(String[] args) {
        // Cannot instantiate Abstract Class
        // Animal animal = new Animal(); // Compilation Error!

        // Polymorphism works perfectly
        Animal cat = new Cat(1, "Alice");

        System.out.println("Abstract Method Implementation: ");
        cat.speak(); // Executes Cat's implementation

        System.out.println("\nConcrete Method Override: ");
        cat.eat();   // Executes Cat's override (which calls super.eat)

        System.out.println("\ntoString Representation: ");
        System.out.println(cat);
    }
}