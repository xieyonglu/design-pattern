package create.builder;

import java.util.List;

public class Client {

	public static void main(String[] args) {
		IBuilder builder = new Builder();
		List<ISender> smsSenders = builder.buildSmsSender(5);
		List<ISender> emailSenders = builder.buildEmailSender(5);
		
		
	}

}
