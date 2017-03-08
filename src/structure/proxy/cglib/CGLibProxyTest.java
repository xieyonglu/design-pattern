package structure.proxy.cglib;

import structure.proxy.ISender;
import structure.proxy.Sender;

public class CGLibProxyTest {

	public static void main(String[] args) {
		CGLibProxy jdkProxy = new CGLibProxy();
		ISender sender = (ISender) jdkProxy.createProxyObject(new Sender());
		
		sender.sendEmail();
	}

}
