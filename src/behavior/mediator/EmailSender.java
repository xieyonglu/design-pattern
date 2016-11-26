package behavior.mediator;

public class EmailSender implements ISender {

	private Mediator mediator;

	public EmailSender(Mediator mediator) {
		this.mediator = mediator;
	}

	public Mediator getMediator() {
		return mediator;
	}

	@Override
	public void send() {
		System.out.println("==EmailSender send==");
	}

}
