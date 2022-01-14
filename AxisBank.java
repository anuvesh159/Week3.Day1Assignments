package wee3.day1;

public class AxisBank extends BankInfo {
	
	public void deposit() {
		System.out.println("To deposit more than Rs. 49,950 per account per day, please update your PAN details by contacting any Axis Bank Branch");
	}
	public static void main(String[] args) {
		
		BankInfo norms = new AxisBank();
		
		norms.savings();
		norms.fixed();
		norms.deposit();
		
		BankInfo myRules = new BankInfo();
		myRules.deposit();
	}
	
}
