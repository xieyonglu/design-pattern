package create.abstractfactory;

public class EmailFactoryProvider extends AbstractFactoryProvider {

	@Override
	public ISender provider() {
		return new EmailSender();
	}
	
}
