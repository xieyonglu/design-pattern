package create.abstractfactory;

public class Client {

	public static void main(String[] args) {
		AbstractFactoryProvider smsFactoryProvider = new SmsFactoryProvider();
		ISender smsSender = smsFactoryProvider.provider();
		smsSender.send();
		
		AbstractFactoryProvider emailFactoryProvider = new EmailFactoryProvider();
		ISender emailSender = emailFactoryProvider.provider();
		emailSender.send();
	}

}
