package behavior.chainofresponsibility;

public abstract class AbstractHandler {

	private AbstractHandler handler;

	public AbstractHandler getHandler() {
		return handler;
	}

	public void setHandler(AbstractHandler handler) {
		this.handler = handler;
	}

	public void operate() {
		System.out.println("==Handler operate==");
		if(this.handler != null) {
			this.handler.operate();
		}
	}

}
