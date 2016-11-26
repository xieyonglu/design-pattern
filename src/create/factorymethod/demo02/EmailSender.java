package create.factorymethod.demo02;

public class EmailSender implements ISender {

	@Override
	public void send() {
		System.out.println("==Email send==");
	}

}
