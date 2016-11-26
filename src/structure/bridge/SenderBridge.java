package structure.bridge;

public class SenderBridge extends AbstractSenderBridge {

	public SenderBridge(ISender sender) {
		super(sender);
	}
	
	@Override
	public void send() {
		System.out.println("==SenderBridge send==");
		this.getSender().send();
	}

}
