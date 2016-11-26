package create.abstractfactory;

public class EmailSender implements ISender {

	@Override
	public void send() {
		System.out.println("==Email send==");
	}

}
