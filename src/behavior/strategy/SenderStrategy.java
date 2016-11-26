package behavior.strategy;

public class SenderStrategy {

	private ISender sender;
	
	public SenderStrategy(ISender sender) {
		this.sender = sender;
	}
	
	public void send() {
		sender.send();
	}
	
}
