package structure.bridge;

public class EmailSender implements ISender {

	@Override
	public void send() {
		System.out.println("==Sender sendEmail==");
	}

}
