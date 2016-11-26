package create.factorymethod.demo01;

/**
 * <h1>简单工厂方法</h1>
 * @author yonglu.xie
 * @date 2016-11-26
 * @since 1.0.0
 */
public class SenderFactory {
	
	private SenderFactory(){}

	public static ISender producerSender(String type) {
		if("sms".equals(type)) {
			return new SmsSender();
		} else if("email".equals(type)) {
			return new EmailSender();
		}
		return null;
	}
	
}
