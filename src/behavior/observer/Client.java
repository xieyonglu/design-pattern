package behavior.observer;

public class Client {

	public static void main(String[] args) {
		IObserver aObserver = new AObserver();
		IObserver bObserver = new BObserver();
		
		ISubject subject = new Subject();
		subject.addObserver(aObserver);
		subject.addObserver(bObserver);
		
		subject.operate();
	}
	
}
