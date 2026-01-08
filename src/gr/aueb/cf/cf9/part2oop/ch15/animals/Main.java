package gr.aueb.cf.cf9.part2oop.ch15.animals;

public class Main {

    public static void main(String[] args) {

        ISpeakable alice = new Cat("Alice");
        ISpeakable bob = new Dog("Bob", 5);

        // Tight Coupling Demo (Anti-Pattern)
        System.out.println("Tightly Coupled School: ");
        SpeakingSchool badSchool = new SpeakingSchool();
        badSchool.learnToSpeak();

        // Dependency Injection Demo (Best Practice)
        System.out.println("\nDependency Injection School: ");

        // Injecting a Cat
        GenericSpeakingSchool catSchool = new GenericSpeakingSchool(alice);
        catSchool.speak();

        // Injecting a Dog
        GenericSpeakingSchool dogSchool = new GenericSpeakingSchool(bob);
        dogSchool.speak();
    }
}