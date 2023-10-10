public class PrintPrimeNumbers {
    public static void main(String[] args) {
        for (int numberToTest = 2; numberToTest <= 100; numberToTest++) {
            boolean isPrime = true;

            for (int i = 2; i <= numberToTest / 2; i++) {
                if (numberToTest % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(numberToTest + " ");
            }
        }
    }
}

