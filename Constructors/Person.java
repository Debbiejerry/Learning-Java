package Constructors;

/* 
In Java, a constructor is a special type of method that is used to initialize objects when they are created. Constructors are responsible for setting initial values for the instance variables of an object and preparing the object for use. Constructors are called automatically when you create a new object using the `new` keyword.

Here are some key points about constructors in Java:

1. Name and Signature: A constructor has the same name as the class it belongs to and has no return type, not even `void`. It cannot be inherited or overridden.

2. Default Constructor: If you don't provide any constructors in your class, Java automatically provides a default constructor with no parameters. This default constructor initializes instance variables to their default values (e.g., `0`, `null`, `false`).

3. Parameterized Constructors: You can create constructors with parameters to initialize instance variables with specific values at the time of object creation. These constructors allow you to set different initial values for different objects.

4. Constructor Overloading: Just like regular methods, you can have multiple constructors in a class with different parameter lists. This is called constructor overloading. It allows you to create objects with various initialization options.

5. This Keyword: The `this` keyword is used to refer to the current instance of the class. It is often used within constructors to differentiate between instance variables and constructor parameters with the same name. For example, `this.variableName` refers to the instance variable, while `variableName` refers to the parameter.

6. Chaining Constructors: Java allows you to call one constructor from another using the `this()` keyword. This is useful when you want to reuse initialization code between constructors.

7. Access Modifiers: Constructors can have access modifiers like `public`, `private`, `protected`, or package-private (no modifier). The choice of access modifier determines from where the constructor can be accessed.

Here's an example of a simple class with constructors in Java:

*/
public class Person {
// This line starts the definition of a new class named Person.

    private String name;
    private int age;
    // These lines declare two private instance variables: name of type String and age of type int. They will be used to store the name and age of a person.

    // Default constructor
    public Person() {
        name = "Unknown"; 
        age = 0;
    }
    //This block defines a constructor called Person with no parameters. This is the default constructor. It initializes the name variable with the value "Unknown" and the age variable with 0.

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // This block defines another constructor called Person with two parameters: name (of type String) and age (of type int). This is a parameterized constructor. It initializes the instance variables name and age with the values provided as arguments to the constructor.

    // Getter methods for name and age
    public String getName() {
        return name;
    }
    // This method is a getter method that returns the value of the name instance variable.

    public int getAge() {
        return age;
    }
    // This method is a getter method that returns the value of the age instance variable.

    public static void main(String[] args) {
        Person person1 = new Person(); // Uses default constructor
        Person person2 = new Person("Alice", 25); // Uses parameterized constructor

        System.out.println(person1.getName()); // Output: Unknown
        System.out.println(person2.getName()); // Output: Alice
    }
}


//In this example, the `Person` class has both a default constructor and a parameterized constructor. The `main` method demonstrates how to create objects using these constructors.