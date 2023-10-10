// Prime numbers are positive integers greater than 1 that have no divisors other than 1 and itself.

// Comments are written after the code block!!!

/*public class TestAPrimeNumber {
    // This line declares a class named 'TestAPrimeNumber'.
    public static void main (String[] args) {
        // This line defines the 'main' method, which is the entry point of the program. The 'main' method is where the program execution starts when you run the program.

        int numberToTest = 17;
        // This line declares an integer variable named 'numberToTest' and assigns it the value of 17, it is the number to be tested. This value can be changed to test the program with different numbers.

        boolean isPrime = true;
        // This 'if' statement checks if 'numberToTest' is evenly divisible by 'i' (i.e, 'numberToTest % i' equals 0). I fit is, it means the number is not prime, so 'isPrime' is set to 'false' and the 'break' statement is used to exit the loop early.

        if (numberToTest <= 1) {
            isPrime = false;
        }

        else {
        // This is the start of an 'if-else' statement. It checks if the 'numberToTest' is less than or equal to 1. If it is, the value of 'isPrime' is set to 'false' because prime numbers are defined as positive integers greater than 1.

            for (int i = 2; i <= Math.sqrt(numberToTest); i++) {
            // This line begins a 'for' loop that starts with 'i' as 2 and continues as long as 'i' is less than or equal to the square root of 'numberToTest'. The loop will increment 'i' by each iteration.

                if (numberToTest % i == 0) {
                    isPrime = false;
                    break;
                }
                // This 'if' statement checks if 'numberToTest' is evenly divisible by 'i' (i.e, 'numberToTest % i' equals 0). If it is, it means the number is not prime, so 'isPrime' is set to 'false' and the 'break' statement is used to exit the loop early.
            }
        
        }
        // This is the end of the 'for' loop and the 'else' block. if the loop completes without finding a divisor that evenly divides the 'numberToTest', then the number is prime, and 'isPrime' remains 'true'.

        if (isPrime) {
            System.out.println(numberToTest + " is a prime number.");
        }

        else {
            System.out.println(numberToTest + " is not a prime number.");
        }
        // This block of code prints the final result based on the value of 'isPrime'. If 'isPrime' is 'true', it means the number is prime and a corresponding message is printed. If 'isPrime' is 'false', it means the number is not prime and a different message is printed.

    }
}*/

/* 
*****************************************Why is 'Math.sqrt(numberToTest)' used?*********************************
The 'Math.sqrt(numberToTest)' is used to calculate the square root of the 'numberToTest'. Here's why it is used in the context of checking for prime numbers:
When testing whether a number is prime, we only need to check for divisors up to its square root. This is because if a number 'n' has a divisor greater than its square root, then it must also have a corresponding divisor smaller than its square root that would have been checked earlier in the loop.
*/

public class TestAPrimeNumber {
    // This line declares a class named 'TestAPrimeNumber'.
    public static void main (String[] args) {
        // This line defines the 'main' method, which is the entry point of the program. The 'main' method is where the program execution starts when you run the program.

        int numberToTest = 17;
        // This line declares an integer variable named 'numberToTest' and assigns it the value of 17, it is the number to be tested. This value can be changed to test the program with different numbers.

        boolean isPrime = true;
        // This 'if' statement checks if 'numberToTest' is evenly divisible by 'i' (i.e, 'numberToTest % i' equals 0). If it is, it means the number is not prime, so 'isPrime' is set to 'false' and the 'break' statement is used to exit the loop early.

        if (numberToTest <= 1) {
            isPrime = false;
        }

        else {
        // This is the start of an 'if-else' statement. It checks if the 'numberToTest' is less than or equal to 1. If it is, the value of 'isPrime' is set to 'false' because prime numbers are defined as positive integers greater than 1. Otherwise, it continues to the 'else' block.

            for (int i = 2; i <= numberToTest / 2; i++) {
            // This line begins a 'for' loop that starts with 'i' as 2 and continues as long as 'i' is less than half of 'numberToTest'. The loop will increment 'i' by each iteration. now, 'i' starts from 2 because prime numbers begin from 2, following the definition given earlier. 

                if (numberToTest % i == 0) {
                    isPrime = false;
                    break;
                }
                // This 'if' statement checks if 'numberToTest' is evenly divisible by 'i' (i.e, 'numberToTest % i' equals 0). If it is, it means the number is not prime, so 'isPrime' is set to 'false' and this is because prime numbers should not have divisors other than 1 and themselves. The loop also contains a 'break' statement which is used to exit the loop early if a divisor is found.
            }
        
        }
        // This is the end of the 'for' loop and the 'else' block. if the loop completes without finding a divisor that evenly divides the 'numberToTest', then the number is prime, and 'isPrime' remains 'true'.

        if (isPrime) {
            System.out.println(numberToTest + " is a prime number.");
        }

        else {
            System.out.println(numberToTest + " is not a prime number.");
        }
        // This block of code prints the final result based on the value of 'isPrime'. If 'isPrime' is 'true', it means the number is prime and a corresponding message is printed. If 'isPrime' is 'false', it means the number is not prime and a different message is printed.

    }
} 