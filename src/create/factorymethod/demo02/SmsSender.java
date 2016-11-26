package create.factorymethod.demo02;

public class SmsSender implements ISender {

	@Override
	public void send() {
		System.out.println("==SmsSender send==");
	}

}
