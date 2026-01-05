package gr.aueb.cf.cf9.part2oop.ch11;

/**
 * Represents a Student entity.
 * This class demonstrates the definition of a simple Java Bean
 * with private fields, constructors, and encapsulation (getters/setters).
 * It also demonstrates the use of {@code static} fields to maintain
 * a count of all created instances.
 */
public class Student {
    // Static field: belongs to the class, shared by all instances
    private static int studentsCount = 0;

    // Static initialization block (runs once when class is loaded)
    static {
        studentsCount = 0;
    }

    // Instance fields: belong to each specific object
    private int id;
    private String firstname;
    private String lastname;

    // Default Constructor
    public Student() {
        studentsCount++;
    }

    // Overloaded Constructor to initialize a student with specific details.
    public Student(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        studentsCount++;
    }

    // Public Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    // Static Getter & Setter for the static field
    public static int getStudentsCount() {
        return studentsCount;
    }

    public static void setStudentsCount(int studentsCount) {
        Student.studentsCount = studentsCount;
        // this.id = 0; από static καλούμε μόνο static, όχι instance
    }
}
