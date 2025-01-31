package assignment;

import java.util.Random;
import java.util.Scanner;

public class pigGameRandom {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int totalScore = 0;
		int turn = 0;

		System.out.println("Let's Play PIG!\n");

		while (totalScore < 20) {
			turn++;
			System.out.println("TURN " + turn);
			int turnScore = 0;

			while (true) {
				System.out.print("Roll or hold? (r/h): ");
				String choice = scanner.nextLine();

				if (choice.equalsIgnoreCase("r")) {
					int die = (int) (Math.random() * 6) + 1; 
					System.out.println("Die: " + die);

					if (die == 1) {
						System.out.println("Turn over. No score.\n");
						turnScore = 0;
						break;
					} else {
						turnScore += die;
					}
				} else if (choice.equalsIgnoreCase("h")) {
					System.out.println("Score for turn: " + turnScore);
					totalScore += turnScore;
					System.out.println("Total score: " + totalScore + "\n");
					break;
				} else {
					System.out.println("Invalid choice! Enter 'r' to roll or 'h' to hold.");
				}
			}
		}

		System.out.println("You finished in " + turn + " turns!");
		System.out.println("Game over!");

	}
}
