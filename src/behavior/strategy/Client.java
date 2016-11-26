package behavior.strategy;

public class Client {

	public static void main(String[] args) {
		ISender smsSender = new SmsSender();
		ISender emailSender = new EmailSender();
		
		SenderStrategy smsSenderBridge = new SenderStrategy(smsSender);
		smsSenderBridge.send();
		
		SenderStrategy emailSenderBridge = new SenderStrategy(emailSender);
		emailSenderBridge.send();
	}
	
}
