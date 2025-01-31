package assigment2;

import java.util.Scanner;

public class substringfromMainString {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter text: ");
        String mainString = scanner.nextLine();
        
        System.out.print("Enter word to find: ");
        String subString = scanner.nextLine();
        
        if (mainString.indexOf(subString) != -1) { //checks if the word is in the string and returns the index value if not found then return -1
            System.out.println("Word found!");
        } else {
            System.out.println("Word not found!");
        }
	}

}
