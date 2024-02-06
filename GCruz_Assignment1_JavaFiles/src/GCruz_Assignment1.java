/*
 * Class: CMSC203 30339
 * Instructor: Professor Grinberg
 * Description: This project is a color guessing game with 11 rounds. Users input their guesses, and the program calculates how many they guessed correctly
 * Due: 2/12/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Gianpaulo Cruz
*/
import java.util.Scanner;
import java.util.Random;
public class GCruz_Assignment1 {
	
	public static void main(String[] args) {
		
		//Constant variables
	    final String COLOR_RED = "red";
		final String COLOR_GREEN = "green";
		final String COLOR_BLUE = "blue"; 
		final String COLOR_ORANGE = "orange"; 
		final String COLOR_YELLOW = "yellow";
		
		//Round counter
		int rounds = 11;
		
		//Accumulator
		int correctGuesses = 0;
		
		//Creation of Scanner to prompt the user for their input
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String StudentName = input.nextLine();
		
		System.out.print("Describe yourself: "  );
		String UserDescription = input.nextLine();
		
		System.out.print("Due Date: ");
		String date =  input.nextLine();
		
		System.out.println("CMSC203 Assignment1: Test your ESP skills!");
		
		//11 round loop
		for(int i = 0; i < rounds; i++) {
			int roundCounter = i + 1;
			System.out.println("Round " + roundCounter + "\n\nI am thinking of a color.");
			System.out.println("Is it Red, Green, Blue, Orange, or Yellow?");
			
			System.out.println("Enter your guess: ");
			String guess = input.nextLine().toLowerCase();
			
			//Correct color input validation
			while(!(guess.equals(COLOR_RED) || guess.equals(COLOR_GREEN) || guess.equals(COLOR_BLUE) || guess.equals(COLOR_YELLOW)|| guess.equals(COLOR_ORANGE))){
				System.out.println("You enetered an incorrect color. Is it Red, Green, Blue, Orange, or Yellow");
				System.out.println("Enter your guess again: ");
				guess = input.nextLine().toLowerCase();
			}
			
			//Using random class and assigning it a limited range equal to the amount of colors we are using
			Random rand = new Random();
			int randomNumber = rand.nextInt(5 - 1 + 1) + 1;
			
			String choice;
			
			System.out.println();
			
			//Each number listed is associated with a color and has a chance of being rolled on by our randomNumber variable
			switch(randomNumber){
				case 0:
					choice = COLOR_RED;
					System.out.println("I was thinking of the color " + choice);
					if(choice.equals(guess)){
						correctGuesses += 1;
					}
					break;
	
				case 1:
					choice = COLOR_GREEN;
					System.out.println("I was thinking of the color " + choice);

					if(choice.equals(guess)){
						correctGuesses += 1;
					}
					
				break;
				
				case 2: 
					choice = COLOR_BLUE;
					System.out.println("I was thinking of the color " + choice);
					if(choice.equals(guess)){
						correctGuesses += 1;
					}
				break;
				
				case 3:
					choice = COLOR_ORANGE;
					System.out.println("I was thinking of the color " + choice); 
					if(choice.equals(guess)){
						correctGuesses += 1;
					}
						
				break;
				
				case 4: 
					choice = COLOR_YELLOW;					
					System.out.println("I was thinking of the color " + choice);
					if(choice.equals(guess)){
						correctGuesses += 1;
					}
				default:
			}
			
			
		}
		
		input.close();
		
		//Results
		System.out.println("\nGame Over\n\n\n" + "You guessed " + correctGuesses + " out of " + rounds + " colors correctly.");
		System.out.println("Student Name: " + StudentName);
		System.out.println("User Description: " + UserDescription);
		System.out.println("Due Date: " + date);
	}

}
