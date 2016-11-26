package behavior.mediator;

public class Client {

	public static void main(String[] args) {
		Mediator mediator = new Mediator();
		
		mediator.create();
		mediator.work();
	}
	
}
