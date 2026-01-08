package gr.aueb.cf.cf9.part2oop.ch15.abstract_classes;

public class Cat extends Animal {
    public Cat() {}

    public Cat(long id, String name) {
        super(id, name); // Calls Animal(id, name)
    }

    @Override
    public void speak() {
        System.out.println("Meow!");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("She ate all her food");
    }

    @Override
    public String toString() {
        return "Cat: " + getName();
    }
}

