package behavior.interpreter;

public class DivideInterpreter implements IInterpreter {

	@Override
	public int interpret(Context context) {
		return context.getNum1() / context.getNum2();
	}

}
