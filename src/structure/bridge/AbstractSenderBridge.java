package structure.bridge;

public abstract class AbstractSenderBridge {

	private ISender sender;
	
	public AbstractSenderBridge(ISender sender) {
		this.sender = sender;
	}
	
	public ISender getSender() {
		return sender;
	}

	public void setSender(ISender sender) {
		this.sender = sender;
	}

	public void send() {
		sender.send();
	}
	
}
