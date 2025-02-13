package Interface.model;

public class DebitCardPayment implements IPayment {
	public void processPayment(double amount) {
		double interest=amount*0.5;
		double totalamount=amount+interest;
		System.out.println("Process Debit Card Payment: Rupees" +amount);
		System.out.println("Total amount to be paid in debit card method: " +totalamount);
	}

}
