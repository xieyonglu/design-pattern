package behavior.memento;

public class Original {

	private String value;

	public Original() {
	}
	
	/**
	 * 创建备忘录
	 * @return
	 */
	public Memento create() {
		return new Memento(this.getValue());
	}
	
	/**
	 * 恢复备忘录
	 * @param memento
	 */
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
