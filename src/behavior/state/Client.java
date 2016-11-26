package behavior.state;

public class Client {

	public static void main(String[] args) {
		State state = new State();
		Context context = new Context();
		context.setState(state);
		
		//
		state.setValue("start");
		context.execute();
		
		//
		state.setValue("process");
		context.execute();
		
		//
		state.setValue("end");
		context.execute();
	}

}
