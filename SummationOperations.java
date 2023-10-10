public class SummationOperations {
    public static void main(String[] args) {
        int resultMultiply = multiplyUsingSummation(5, 3);
        System.out.println("Result of multiplication: " + resultMultiply);

        int resultDivide = divideUsingSummation(15, 5);
        System.out.println("Result of division: " + resultDivide);
    }

    // Method to perform multiplication using summation
    public static int multiplyUsingSummation(int a, int b) {
        int result = 0;
        for (int i = 0; i < b; i++) {
            result += a; // Adding 'a' to itself 'b' times
        }
        return result;
    }

    // Method to perform division using summation
    public static int divideUsingSummation(int dividend, int divisor) {
        int quotient = 0;
        while (dividend >= divisor) {
            dividend -= divisor; // Subtracting 'divisor' from 'dividend' until it's less than 'divisor'
            quotient++;
        }
        return quotient;
    }
}

