package behavior.mediator;

public class Mediator {

	private ISender smsSender;
	private ISender emailSender;
	
	public void create(){
		smsSender = new SmsSender(this);
		emailSender = new EmailSender(this);
	}
	
	public void work() {
		smsSender.send();
		emailSender.send();
	}
	
}
