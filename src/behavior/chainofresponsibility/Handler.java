package behavior.chainofresponsibility;

public class Handler extends AbstractHandler {

	private String value;

	public Handler(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public void operate() {
		System.out.println("==Handler operate==" + this.getValue());
		if (this.getHandler()!= null) {
			this.getHandler().operate();
		}
	}

}
