import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		double roomLength; 
		double roomWidth;
		double roomHeight;
		char answer = 'y';
		
			System.out.println("Welcome to Grand Circus' Room Detail Generator!");
		
		  while (answer == 'y') {
			System.out.println("Enter Length: ");
			roomLength = scnr.nextDouble();
				
			System.out.println("Enter Width: ");
			roomWidth = scnr.nextDouble();
			
			System.out.println("Enter Height: ");
			roomHeight = scnr.nextDouble();
					
			System.out.println("Area: " + (roomLength * roomWidth));
			System.out.println("Perimeter: " + (roomLength * 2 + roomWidth * 2));
			System.out.println("Area: " + (roomLength * roomWidth * roomHeight));
				
			System.out.println("Continue? (y/n)");
			answer = scnr.next().charAt(0);
		  }
		       
	}

}
