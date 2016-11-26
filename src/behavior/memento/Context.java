package behavior.memento;

public class Context {

	private String value;
	private Memento memento;

	public Context() {
	}
	
	public void restore() {
		this.value = this.getMemento().getValue();
	}

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
		this.memento.setValue(this.getValue());
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
