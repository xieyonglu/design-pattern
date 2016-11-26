package structure.facade;

public class Client {

	public static void main(String[] args) {
		SenderFacade senderFacade = new SenderFacade();
		
		senderFacade.send();
	}
	
}
