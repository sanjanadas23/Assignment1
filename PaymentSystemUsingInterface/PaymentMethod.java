package Interface.test;

import java.util.*;

import Interface.model.*;

public class PaymentMethod {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double amount;

        
        while (true) {
            System.out.println("\nSelect Payment Method: ");
            System.out.println("1. Credit Card ");
            System.out.println("2. Debit Card ");
            System.out.println("3. UPI ");
            System.out.print("Enter your choice: ");

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice >= 1 && choice <= 3) 
                {
                    break;  
                } 
                else {
                    System.out.println("Invalid choice! Please enter a number between 1 and 3.\n");
                }
            } 
            else {
                System.out.println("Invalid input! Please enter a number between 1 and 3.\n");
                scanner.next(); 
            }
        }

        
        while (true) {
            System.out.print("Enter amount to pay: ");

            if (scanner.hasNextDouble()) {
                amount = scanner.nextDouble();
                if (amount > 0) {
                    break;  
                } 
                else {
                    System.out.println("Amount must be greater than zero! Please enter a valid amount.\n");
                }
            } 
            else {
                System.out.println("Invalid input! Please enter a valid numeric amount.\n");
                scanner.next(); 
            }
        }

        IPayment paymentMethod = null;

        switch (choice) {
            case 1:
                paymentMethod = new CreditCardPayment();
                break;
            case 2:
                paymentMethod = new DebitCardPayment();
                break;
            case 3:
                paymentMethod = new UPIPayment();
                break;
        }

        // Process the selected payment with interest
        paymentMethod.processPayment(amount);

        
    }

	}


