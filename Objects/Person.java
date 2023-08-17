package Objects;

public class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String initialName, int initialAge) {
        name = initialName;
        age = initialAge;
    }

    // Method to display person's information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Create two Person objects
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 30);

        // Display information about the objects
        System.out.println("Information for person1:");
        person1.displayInfo();

        System.out.println("\nInformation for person2:");
        person2.displayInfo();

        // Demonstrate object identity and state
        if (person1 == person2) {
            System.out.println("\nperson1 and person2 are the same object.");
        } else {
            System.out.println("\nperson1 and person2 are different objects.");
        }
    }
}



