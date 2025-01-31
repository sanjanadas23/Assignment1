package secondSession;

import java.util.Scanner;

public class TreasureIslangGame {
	
	public static void main(String[] args) {
		System.out.println("Welcome to Treasure Island, Your mission is to find the treasure");
		
		Scanner userInput=new Scanner(System.in);
		System.out.println("Choose left or right: ");
		String move1=userInput.nextLine();
		
		if(move1.equalsIgnoreCase("right")) {
			System.out.println("Fall in a hole, Game over");
			System.exit(0);
			
		}
		else if (move1.equalsIgnoreCase("left")){
			System.out.println("Choose Swim or Wait: ");
			String move2=userInput.nextLine();
			
			if (move2.equalsIgnoreCase("swim")) {
				System.out.println("Attacked by Trout, Game over");
				System.exit(0);
			}
			else if(move2.equalsIgnoreCase("Wait")) {
				System.out.println("Which door? Red, Blue , Yellow:");
				String move3=userInput.nextLine();
				
				if(move3.equalsIgnoreCase("red")) {
					System.out.println("Burned by fire, Game over");
					System.exit(0);
					
				}
				else if(move3.equalsIgnoreCase("blue")) {
					System.out.println("Eaten by beast, Game over");
					System.exit(0);
				}
				else if(move3.equalsIgnoreCase("yellow")) {
					System.out.println("You Win");
					System.exit(0);
				}
				else {
					System.out.println("Game Over");
				}
			}
			
		}
		
		
		
		
		
		
	}

}
