package Objects;

// Define the Car class
class Car {
    // Properties
    String color;
    String make;
    String model;
    int speed;

    // Constructor (a special method to create objects)
    Car(String c, String m, String mdl) {
        color = c;
        make = m;
        model = mdl;
        speed = 0; // Car starts at 0 speed
    }

    // Method to start the car's engine
    void startEngine() {
        System.out.println("Starting the engine...");
    }

    // Method to accelerate the car
    void accelerate() {
        speed += 10;
        System.out.println("Accelerating. Speed is now: " + speed + " km/h");
    }

    // Method to apply the brakes
    void brake() {
        speed -= 5;
        System.out.println("Applying brakes. Speed is now: " + speed + " km/h");
    }

    public static void main(String[] args) {
        // Creating a Car object using the constructor
        Car myCar = new Car("Red", "Toyota", "Corolla");

        // Using the object's methods
        myCar.startEngine();
        myCar.accelerate();
        myCar.accelerate();
        myCar.brake();
    }
}


