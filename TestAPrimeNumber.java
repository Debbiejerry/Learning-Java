// Comments are written before the code block!!!

// This line declares a class named 'TestAPrimeNumber'.
public class TestAPrimeNumber {
    // This line defines the 'main' method, which is the entry point of the program. The 'main' method is where the program execution starts when you run the program.
    public static void main (String[] args) {
        // This line declares an integer variable named 'numberToTest' and assigns it the value of 17. This value can be changed to test the program with different numbers.
        int numberToTest = 17;

        // This line declares a boolean variable named 'isPrime' and initializes it with the value 'true'. This variable will be used to track whether the number is prime or not.
        boolean isPrime = true;

        if (numberToTest <= 1) {
            isPrime = false;
        }

        else {
            for (int i = 2; i <= Math.sqrt(numberToTest); i++) {
                if (numberToTest % 1 == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(numberToTest + " is a prime number.");
        }

        else {
            System.out.println(numberToTest + " is not a prime number.");
        }
    }
}