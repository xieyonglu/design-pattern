package structure.adapter.demo02;

/**
 * <h1>适配器模式 - 对象适配器</h1>
 * @author yonglu.xie
 *
 */
public class Sender implements ISender {
	
	private SmsSenderAdapter smsSenderAdapter = new SmsSenderAdapter();

	@Override
	public void sendSms() {
		smsSenderAdapter.sendSms();
	}

	@Override
	public void sendEmail() {
		System.out.println("==Sender sendEmail==");
	}

}
