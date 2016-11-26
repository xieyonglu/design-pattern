package structure.decorator;

public class SenderDecorator {

	private ISender sender;
	
	public SenderDecorator(ISender sender) {
		this.sender = sender;
	}
	
	public void sendSms() {
		System.out.println("==Sender before...==");
		sender.sendSms();
		System.out.println("==Sender after...==");
	}
	
}
