package wee3.day1;

public class Andriod extends SmartPhone {
	
	public void takeVideo() {
		System.out.println("Taken Video");
	}
	
	
	
	public static void main(String[] args) {
		
		Andriod Redmi = new Andriod();
		
		Redmi.sendMsg();
		Redmi.saveContact();
		Redmi.makeCall();
		Redmi.takeVideo();
		Redmi.accessWhatsapp();
		
		SmartPhone Vivo = new SmartPhone();
		Vivo.takeVideo();
	
	}

}
