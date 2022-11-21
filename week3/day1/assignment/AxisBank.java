package week3.day1.assignment;

public class AxisBank extends BankInfo{

	public void deposit() {
		// TODO Auto-generated method stub

		System.out.println("Overridden deposite method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AxisBank bank = new AxisBank();
		bank.savings();
		bank.fixed();
		bank.deposit();
		
	}

}
