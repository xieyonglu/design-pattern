package behavior.interpreter;

public class Client {

	public static void main(String[] args) {
		Context context = new Context(6, 2);
		
		IInterpreter addInterpreter = new AddInterpreter();
		IInterpreter subtractInterpreter = new SubtractInterpreter();
		IInterpreter multiplyInterpreter = new MultiplyInterpreter();
		IInterpreter divideInterpreter = new DivideInterpreter();
		
		System.out.println("AddInterpreter interpret --> " + addInterpreter.interpret(context));
		System.out.println("SubtractInterpreter interpret --> " + subtractInterpreter.interpret(context));
		System.out.println("MultiplyInterpreter interpret --> " + multiplyInterpreter.interpret(context));
		System.out.println("DivideInterpreter interpret --> " + divideInterpreter.interpret(context));
	}

}
