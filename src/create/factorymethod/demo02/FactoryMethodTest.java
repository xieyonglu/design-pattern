package create.factorymethod.demo02;

public class FactoryMethodTest {

	public static void main(String[] args) {
		ISender smsSender = SenderFactory.producerSmsSender();
		smsSender.send();
		
		ISender emailSender = SenderFactory.producerEmailSender();
		emailSender.send();
	}
	
}
