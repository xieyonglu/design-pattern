package behavior.memento;

public class Original {

	private String value;

	public Original() {
	}
	
	public Memento create() {
		return new Memento(this.getValue());
	}
	
	public void restore(Memento memento) {
		this.value = memento.getValue();
	}
	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
