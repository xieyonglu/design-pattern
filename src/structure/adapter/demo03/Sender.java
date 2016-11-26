package structure.adapter.demo03;

public class Sender extends SmsSenderAdapter {

	@Override
	public void sendEmail() {
		System.out.println("==Sender sendEmail==");
	}

}
