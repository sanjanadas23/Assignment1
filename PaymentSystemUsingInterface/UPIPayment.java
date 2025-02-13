package Interface.model;

public class UPIPayment implements IPayment{
	public void processPayment(double amount) {
		double interest=amount*0.8;
		double totalamount=amount+interest;
		System.out.println("Process UPI Payment: Rupees" +amount);
		System.out.println("Total amount to be paid in UPI method: " +totalamount);
	}

}
