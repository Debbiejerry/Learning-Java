package Objects;

class Lamp {
   // stores the value for light
   // true if light is on
   // false if light is off

   boolean isOn;
    // Method to turn on the light
    void turnOn() {
        isOn = true;

        System.out.println("Light on? " + isOn);
    }

    // method to turnoff the light 
    void turnOff() {
        isOn = false;
        System.out.println("Light on? " + isOn);
    }

}

class Main {
    public static void main(String[] args) {
        // create objects led and halogen
        Lamp led = new Lamp();
        Lamp halogen = new Lamp();

        // turn on light by calling method turnOn()
        led.turnOn();
        // turn off light by calling method turnOff()
        halogen.turnOff();
    }
}