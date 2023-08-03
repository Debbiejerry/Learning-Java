import java.util.Random;

public class RandomNumberGenerator1 {
	public static void main(String[] args) {
		int min = 34;
		int max = 55;
		
		Random generateRandom = new Random();
		
		int randomNumber = generateRandom.nextInt(max - min + 1) + min;
		System.out.println("Random number between 15 and 30 is: " + randomNumber);
	}
}
