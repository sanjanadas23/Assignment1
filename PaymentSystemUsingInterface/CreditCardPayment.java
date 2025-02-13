package Interface.model;

public class CreditCardPayment implements IPayment {
	public void processPayment(double amount) {
		double interest=amount*0.2;
		double totalamount=amount+interest;
		System.out.println("Processing Credit Card Payment: Rupees" +amount);
		System.out.println("Total amount to be paid in credit card method: " +totalamount);
	}
	

}
