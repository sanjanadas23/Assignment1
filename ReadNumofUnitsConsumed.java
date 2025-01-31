package secondSession;

import java.util.Scanner;

public class ReadNumofUnitsConsumed {
	
	public static void main(String[] args) {
		int meterCharge=75;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of units consumed: ");
		int unitsconsumed=scanner.nextInt();
		int charge;
		
		if (unitsconsumed<=100) {
			charge=unitsconsumed*5;
			
		}
		else {
			if (unitsconsumed<=250) {
				charge=unitsconsumed*10;
				
			}
			else {
				charge=unitsconsumed*20;
			}
			
		}
		int totalWaterBill;
		totalWaterBill=charge+meterCharge;
		System.out.println("The total Water Bill is: " + totalWaterBill);
		
		
		
		
	}

}
