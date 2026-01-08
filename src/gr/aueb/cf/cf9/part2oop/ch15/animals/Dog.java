package gr.aueb.cf.cf9.part2oop.ch15.animals;

public class Dog implements ISpeakable {
    private String name;
    private int age;

    public Dog() {}

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void speak() {
        System.out.println(name + " is " + age + "years old says: Woof!");
    }

    @Override
    public String toString() {
        return "Dog {name = '" + name + "', age=" + age + "}";
    }
}