package structure.bridge;

public class Client {

	public static void main(String[] args) {
		ISender smsSender = new SmsSender();
		ISender emailSender = new EmailSender();
		
		SenderBridge smsSenderBridge = new SenderBridge(smsSender);
		smsSenderBridge.send();
		
		SenderBridge emailSenderBridge = new SenderBridge(emailSender);
		emailSenderBridge.send();
	}
	
}
