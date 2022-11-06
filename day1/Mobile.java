package week1.day1;

public class Mobile {
	
	public String mobileBrandName = "iPhone 13";
	public char mobileLogo = '@';
	public short noOfMobilePiece = 100;
	public int modelNumber = 13;
	public long mobileImeiNumber = 123456789098765L;
	public float mobilePrice = 67000.65f;
	public boolean isDamaged = false;

	/* public void makeCall() {
		// TODO Auto-generated method stub
 System.out.println("Calling");
	} 
	
	private void sendMsg() {
		// TODO Auto-generated method stub

		System.out.println("Sending messgae");
	} */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Mobile obj = new Mobile();
		System.out.println(obj.mobileBrandName);
		System.out.println(obj.mobileLogo);
		System.out.println(obj.noOfMobilePiece);
		System.out.println(obj.modelNumber);
		System.out.println(obj.mobileImeiNumber);
		System.out.println(obj.mobilePrice);
		System.out.println(obj.isDamaged);
		
	}

}
