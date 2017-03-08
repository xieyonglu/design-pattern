package structure.proxy.jdk;

import structure.proxy.ISender;
import structure.proxy.Sender;

public class JdkProxyTest {

	public static void main(String[] args) {
		JdkProxy jdkProxy = new JdkProxy();
		ISender sender = (ISender) jdkProxy.newProxy(new Sender());
		sender.sendEmail();
	}

}
