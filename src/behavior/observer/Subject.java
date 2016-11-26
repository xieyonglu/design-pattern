package behavior.observer;

public class Subject extends AbstractSubject implements ISubject {
	
	public void operate() {
		System.out.println("==Subject operate==");
		
		// 通知所有的观察者
		this.notifyObserver();
	}
	
}
