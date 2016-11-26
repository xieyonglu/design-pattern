package behavior.strategy;

public class SmsSender implements ISender {

	@Override
	public void send() {
		System.out.println("==Sender sendSms==");
	}

}
