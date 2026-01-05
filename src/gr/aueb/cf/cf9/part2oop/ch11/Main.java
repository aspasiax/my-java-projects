package gr.aueb.cf.cf9.part2oop.ch11;

/**
 * Driver class to demonstrate Class Instantiation and Object interaction.
 */
public class Main {

    public static void main(String[] args) {

        // 1. Product Instantiation
        Product milk = new Product(1L, "Milk A", "Light Milk", 1.5, 2, true);
        Product juice = new Product(2L, "Juice A", "Orange Juice", 2.5, 1, true);

        // 2. User Instantiation
        User user = new User();  // Default constructor (0, null, null, null, null, false)
        User andreas = new User(1L, "Andreas", "Papadopoulos", "andrew", "12345", true);

        System.out.println("User Username: " + andreas.getUsername());
        System.out.println("User Active: " + andreas.isActive());

        // 3. Customer Instantiation
        Customer customer = new Customer();

        // 4. Student Instantiation & Static Count

        // Initializing instances
        Student student1 = new Student();            // id=0
        Student alice = new Student(1, "Alice", "W.");
        Student bob = new Student(2, "Bob", "D.");

        // Using Setters to update state
        student1.setId(3);
        student1.setFirstname("Anna");
        student1.setLastname("Karenina");

        Student student2 = new Student(4, "John", "P.");
        student2.setFirstname("Ioannis"); // Update - Correction

        // Displaying Data via Getters
        System.out.println("\nStudent Details: ");
        System.out.printf("Id: %d, Firstname: %s, Lastname: %s\n",
                alice.getId(), alice.getFirstname(), alice.getLastname());

        System.out.println(student1.getFirstname() + " " + student1.getLastname());

        // Displaying Static Variable (Access via Class Name)
        System.out.println("\nTotal Students Created: " + Student.getStudentsCount());
    }
}
