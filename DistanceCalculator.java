import java.util.Scanner;

public class DistanceCalculator {
	public static void main(String[] args) {
		
		//create scanner object
		Scanner readUserInput = new Scanner(System.in);
		
		//output
		System.out.println("Enter the values for the coordinates of the first point (x1, y1): ");
		
		//store the user input in the variables below:
		double x1 = readUserInput.nextDouble();
		double y1 = readUserInput.nextDouble();
		
		//Tell the user what was entered
		System.out.println("You Entered: " + x1 + " and " + y1 + " as values for the coordinates of the first point (x1, y1)");
		
		//output
		System.out.println("Enter the values for the coordinates of the second point (x2, y2): ");
				
		//store the user input in the variables below:
		double x2 = readUserInput.nextDouble();
		double y2 = readUserInput.nextDouble();
		
		//Tell the user what was entered
		System.out.println("You Entered: " + x2 + " and " + y2 + " as values for the coordinates of the second point (x2, y2)");
		
		//store the returned result in a variable called "distance"
		double distance = calculateDistance(x1, y1, x2, y2);
		
		//print the calculated distance between the two points to the user
		System.out.println("The distance between two points is: " + distance);
		
		readUserInput.close();

	}
	
	//Defining the "calculateDistance" method
	private static double calculateDistance(double x1, double y1, double x2, double y2) {
		double changeInX = x2 - x1;
		double changeInY = y2 - y1;
		
		return Math.sqrt(changeInX * changeInX + changeInY * changeInY);
	}
}
