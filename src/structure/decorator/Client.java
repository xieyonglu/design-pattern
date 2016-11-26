package structure.decorator;

public class Client {

	public static void main(String[] args) {
		ISender sender = new Sender();
		SenderDecorator senderDecorator = new SenderDecorator(sender);
		
		senderDecorator.sendSms();
	}

}
