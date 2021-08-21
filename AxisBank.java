package week3.day1.assignments.Bank;

public class AxisBank extends BankInfo {

	// Overriding existing method

	@Override
	public void deposit() {
		System.out.println("Open Deposit Account with 9% interest Rate");

	}

	public static void main(String[] args) {
		
		AxisBank abObj = new AxisBank();
		//BankInfo biObj=new BankInfo();
		abObj.saving();
		abObj.fixed();
		//biObj.deposit();
		System.out.println(".....Overridden method.....");
		abObj.deposit();
	}

}
