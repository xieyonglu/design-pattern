package structure.proxy;

public class Sender implements ISender {

	@Override
	public void sendSms() {
		System.out.println("==Sender sendSms==");
	}

	@Override
	public void sendEmail() {
		System.out.println("==Sender sendEmail==");
	}

}
