package behavior.command;

public class Command implements ICommand {

	private Receiver receiver;
	
	public Command() {
		receiver = new Receiver();
	}

	@Override
	public void execute() {
		System.out.println("==Command execute==");
		receiver.execute();
	}

}
