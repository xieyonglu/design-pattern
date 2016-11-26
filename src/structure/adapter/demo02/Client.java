package structure.adapter.demo02;

public class Client {

	public static void main(String[] args) {
		ISender sender = new Sender();
		
		sender.sendSms();
		sender.sendEmail();
	}
	
}
