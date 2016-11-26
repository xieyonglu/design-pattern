package behavior.command;

public class Invoker {

	private ICommand command;
	
	public Invoker() {
		command = new Command();
	}
	
	public void execute() {
		System.out.println("==Invoker execute==");
		command.execute();
	}
	
}
