package behavior.chainofresponsibility;

public class Client {

	public static void main(String[] args) {
		AbstractHandler aHandler = new Handler();
		AbstractHandler bHandler = new Handler();
		AbstractHandler cHandler = new Handler();
		
		aHandler.setHandler(bHandler);
		bHandler.setHandler(cHandler);
		
		aHandler.operate();
	}
	
}
