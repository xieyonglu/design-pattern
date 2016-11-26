package structure.bridge;

public abstract class AbstractSenderBridge {

	private ISender sender;
	
	public AbstractSenderBridge(ISender sender) {
		this.sender = sender;
	}
	
	public void send() {
		sender.send();
	}
	
}
