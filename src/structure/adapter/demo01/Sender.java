package structure.adapter.demo01;

/**
 * <h1>适配器模式 - 类适配器</h1>
 * @author yonglu.xie
 *
 */
public class Sender extends SmsSenderAdapter implements ISender {

	@Override
	public void sendEmail() {
		System.out.println("==Sender sendEmail==");
	}

}
