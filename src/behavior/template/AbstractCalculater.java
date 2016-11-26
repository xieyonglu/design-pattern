package behavior.template;

public abstract class AbstractCalculater {

	public int calculate(String numString) {
		String[] numArray = numString.split(",");
		Integer num1 = Integer.parseInt(numArray[0]);
		Integer num2 = Integer.parseInt(numArray[1]);
		
		return defaultCalculate(num1, num2);
	}
	
	protected abstract int defaultCalculate(int num1, int num2);
	
}
