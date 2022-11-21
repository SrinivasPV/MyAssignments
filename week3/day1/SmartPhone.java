package week3.day1;

public class SmartPhone extends Android {
	
	public void connectWhatsapp() {
		// TODO Auto-generated method stub

		System.out.println("Calling via whatsapp");
	}
	
	public void takeVedio() {
		// TODO Auto-generated method stub
     
		System.out.println("Smartphone");
	}
	
	public static void main(String[] args)
	{
		SmartPhone ph = new SmartPhone();
		ph.sendMsg();
		ph.makeCall();
		ph.saveContact();
		ph.connectWhatsapp();
		ph.takeVedio();
	}

}
