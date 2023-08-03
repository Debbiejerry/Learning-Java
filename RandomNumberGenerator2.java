import java.util.Random;

public class RandomNumberGenerator2 {
	public static void main(String[] args) {
		int min = 0;
		int max = 999;
		
		Random generateRandom = new Random();
		
		int randomNumber = generateRandom.nextInt(max - min + 1) + min;
		System.out.println("Random number between 0 and 999 is: " + randomNumber);
	}
}
