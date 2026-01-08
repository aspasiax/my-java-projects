package gr.aueb.cf.cf9.part2oop.ch15.animals;

public class Cat implements ISpeakable {
    private String name;

    public Cat() {}

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void speak() {
        System.out.println(name + " says: Meow!");
    }

    @Override
    public String toString() {
        return "Cat {name = '" + name + "'}";
    }
}