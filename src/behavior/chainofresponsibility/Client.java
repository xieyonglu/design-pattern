package behavior.chainofresponsibility;

public class Client {

	public static void main(String[] args) {
		Handler aHandler = new Handler("A");
		Handler bHandler = new Handler("B");
		Handler cHandler = new Handler("C");
		
		aHandler.setHandler(bHandler);
		bHandler.setHandler(cHandler);
		
		aHandler.operate();
	}
	
}
