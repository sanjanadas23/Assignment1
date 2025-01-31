package assignment;

import java.util.Random;
import java.util.Scanner;

public class numberGuesser {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Random random=new Random();
		
		while(true) {
			int actualNumber=random.nextInt(100)+1;
			int noOfAttempts=0;
			boolean correctGuess=false;
			int maxAttempts=5;
			
			System.out.println("\nA random number between 1 and 100 is generated");
			
			while(!correctGuess && noOfAttempts<maxAttempts) {
				System.out.print("Guess a number between 1 and 100: ");
				int userNumber=scanner.nextInt();
				noOfAttempts++;
				
				if(userNumber<actualNumber) {
					System.out.println("Sorry, too low");
					
				}
				else if(userNumber> actualNumber) {
					System.out.println("Sorry, too high");
					
				}
				else {
					System.out.println(" You won in " + noOfAttempts);
					correctGuess=true;
				}
			}	
			if(!correctGuess) {
				System.out.println("You have used all attempts");
			}
			System.out.println("Do you want to play again (Yes/no)? : ");
			String playagain=scanner.next();
			
			if(!playagain.equalsIgnoreCase("yes")) {
				System.out.println("Thanks for playing!");
				System.exit(0);
			}
			
		}
	}
}
