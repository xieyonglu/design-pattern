package create.factorymethod.demo01;

public class FactoryMethodTest {

	public static void main(String[] args) {
		ISender smsSender = SenderFactory.producerSender("sms");
		smsSender.send();
		
		ISender emailSender = SenderFactory.producerSender("email");
		emailSender.send();
	}
	
}
