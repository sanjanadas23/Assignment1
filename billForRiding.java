package assignment;

import java.util.Scanner;

public class billForRiding {
	public static void main(String[] args) {
		
		Scanner userInput=new Scanner(System.in);
		System.out.println("Welcome, Please Enter your Height in cm: ");
		int height=userInput.nextInt();
		if(height>120) {
			System.out.println("You can ride");
			System.out.println("Enter your age: ");
			int age=userInput.nextInt();
			int totalBill=0;
			if(age<0) {
				System.out.println("Sorry not a valid age, Please Enter a valid age");
				
			}
			else if(age<12) {
				System.out.println("Do you want photos (Yes/No)?: ");
				String photosCost = userInput.next();
				if(photosCost.equalsIgnoreCase("yes")) {
					totalBill=totalBill+5+3;
					System.out.println("The final bill is : " + totalBill + " dollars");
				}
				else if(photosCost.equalsIgnoreCase("no")) {
					totalBill=totalBill+5;
					System.out.println("The final bill is : " + totalBill + " dollars");
				}
			}
			else if(age>=12 && age==18) {
				System.out.println("Do you want photos (Yes/No)?: ");
				String photosCost = userInput.next();
				if(photosCost.equalsIgnoreCase("yes")) {
					totalBill=totalBill+7+3;
					System.out.println("The final bill is : " + totalBill + " dollars");
				}
				else if(photosCost.equalsIgnoreCase("no")) {
					totalBill=totalBill+7;
					System.out.println("The final bill is : " + totalBill + " dollars");
				}
			}
			else if(age>18 && age<45) {
				System.out.println("Do you want photos (Yes/No)?: ");
				String photosCost = userInput.next();
				if(photosCost.equalsIgnoreCase("yes")) {
					totalBill=totalBill+12+3;
					System.out.println("The final bill is : " + totalBill + " dollars");
				}
				else if(photosCost.equalsIgnoreCase("no")) {
					totalBill=totalBill+12;
					System.out.println("The final bill is : " + totalBill + " dollars");
				}
			}
			else if (age==45 && age<=55) {
				System.out.println("Do you want photos (Yes/No)?: ");
				String photosCost = userInput.next();
				if(photosCost.equalsIgnoreCase("yes")) {
					totalBill=totalBill+3;
					System.out.println("The final bill is : " + totalBill + " dollars");
				}
				else if(photosCost.equalsIgnoreCase("no")) {
					totalBill=totalBill;
					System.out.println("The final bill is : " + totalBill + " dollars");
				}
			}
			
		}
		else {
			System.out.println("You cannot ride, Thank you.");
		}
	}

}
