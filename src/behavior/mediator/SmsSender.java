package behavior.mediator;

public class SmsSender implements ISender {
	
	private Mediator mediator;
	
	public SmsSender(Mediator mediator) {
		this.mediator = mediator;
	}
	
	public Mediator getMediator() {
		return mediator;
	}

	@Override
	public void send() {
		System.out.println("==SmsSender send==");
	}

}
