package create.factorymethod.demo02;

/**
 * <h1>复杂工厂方法</h1>
 * @author yonglu.xie
 * @date 2016-11-26
 * @since 1.0.0
 */
public class SenderFactory {
	
	private SenderFactory(){}

	public static ISender producerSmsSender() {
		return new SmsSender();
	}
	
	public static ISender producerEmailSender() {
		return new EmailSender();
	}
	
}
