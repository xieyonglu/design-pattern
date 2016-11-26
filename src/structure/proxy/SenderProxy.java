package structure.proxy;

public class SenderProxy {

	private ISender sender;
	
	public SenderProxy() {
		this.sender = new Sender();
	}
	
	public void sendSms() {
		System.out.println("==Sender before...==");
		sender.sendSms();
		System.out.println("==Sender after...==");
	}
	
}
