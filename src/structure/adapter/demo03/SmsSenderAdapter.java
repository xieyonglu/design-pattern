package structure.adapter.demo03;

/**
 * <h1>适配器模式 - 接口适配器</h1>
 * @author eleme
 *
 */
public abstract class SmsSenderAdapter implements ISender {

	public void sendSms() {
		System.out.println("==Sender sendSms==");
	}
	
}
