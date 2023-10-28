import java.util.Scanner; // import Scanner class
// class declaration
class mySecondProgram { 
public static void main(String[] args) { 
Scanner input = new Scanner(System.in); //create a Scanner object called input
System.out.println("Enter the first and second numbers separated by enter: \n"); 
int number1 =input.nextInt(); //invoke the Integer method of the scanner class and accept input from user
int number2 =input.nextInt(); //invoke the Integer method of the scanner class and accept input from user
int number3 =input.nextInt();
System.out.println("Your result is:"); 
System.out.println(number1 + number2 + number3); }} //displaying the result
