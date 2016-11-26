package structure.proxy;

public class Client {

	public static void main(String[] args) {
		SenderProxy senderProxy = new SenderProxy();
		
		senderProxy.sendSms();
	}

}
