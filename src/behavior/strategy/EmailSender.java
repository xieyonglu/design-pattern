package behavior.strategy;

public class EmailSender implements ISender {

	@Override
	public void send() {
		System.out.println("==Sender sendEmail==");
	}

}
