package create.abstractfactory;

public class SmsFactoryProvider extends AbstractFactoryProvider {

	@Override
	public ISender provider() {
		return new SmsSender();
	}
	
}
