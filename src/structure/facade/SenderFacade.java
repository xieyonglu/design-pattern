package structure.facade;

public class SenderFacade {

	private ISender smsSender;
	private ISender emailSender;
	
	public SenderFacade() {
		smsSender = new SmsSender();
		emailSender = new EmailSender();
	}
	
	public void send() {
		smsSender.send();
		emailSender.send();
	}
	
}
