package Objects;

/**
BicycleClassExample
 */
class BicycleClassExample {
    private int gear = 5;
    // this.gear = 5;
    public void braking() {
        System.out.println("Braking");
    }
    
    public static void main(String[] args) {
    BicycleClassExample okada = new BicycleClassExample();
    okada.braking();
    }
}

