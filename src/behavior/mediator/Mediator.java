package behavior.mediator;

public class Mediator implements IMediator {

	private ISender smsSender;
	private ISender emailSender;
	
	@Override
	public void create(){
		smsSender = new SmsSender(this);
		emailSender = new EmailSender(this);
	}
	
	@Override
	public void work() {
		smsSender.send();
		emailSender.send();
	}
	
}
