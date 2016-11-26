package behavior.template;

public class Client {

	public static void main(String[] args) {
		AbstractCalculater addCalculater = new AddCalculater();
		AbstractCalculater subtractCalculater = new SubtractCalculater();
		AbstractCalculater multiplyCalculater = new MultiplyCalculater();
		AbstractCalculater devideCalculater = new DivideCalculater();
		
		String numString = "6,2";
		
		System.out.println("AddCalculater calculate --> " + addCalculater.calculate(numString));
		System.out.println("SubtractCalculater calculate --> " + subtractCalculater.calculate(numString));
		System.out.println("MultiplyCalculater calculate --> " + multiplyCalculater.calculate(numString));
		System.out.println("DivideCalculater calculate --> " + devideCalculater.calculate(numString));
	}
	
}
