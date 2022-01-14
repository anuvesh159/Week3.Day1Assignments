package wee3.day1;

public class Mobile1 {
	
	public void makeCall() {
		System.out.println("Make the call");
	}
	
	public void sendMsg() {
		System.out.println("Send the Message");
	}
	public void saveContact() {
		
		System.out.println("Saved the contact");
	}
	
	

	public static void main(String[] args) {
		Mobile1 Nokia = new Mobile1();
		
		Nokia.makeCall();
		Nokia.saveContact();
		Nokia.sendMsg();

	}

}
