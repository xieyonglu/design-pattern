package behavior.state;

public class Context {

	private State state;

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	public void execute() {
		if("start".equals(state.getValue())) {
			System.out.println("==start==");
		} else if("process".equals(state.getValue())) {
			System.out.println("==process==");
		} else if("end".equals(state.getValue())) {
			System.out.println("==end==");
		}
	}
	
}
