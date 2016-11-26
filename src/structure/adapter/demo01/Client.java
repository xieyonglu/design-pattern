package structure.adapter.demo01;

public class Client {

	public static void main(String[] args) {
		ISender sender = new Sender();
		
		sender.sendSms();
		sender.sendEmail();
	}
	
}
