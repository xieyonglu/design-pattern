package behavior.observer;

import java.util.LinkedList;
import java.util.List;

public class Subject implements ISubject {

	private List<IObserver> observers = new LinkedList<>();
	
	public void addObserver(IObserver observer) {
		observers.add(observer);
	}
	
	public void notifyObserver() {
		for(IObserver observer : observers) {
			observer.update();
		}
	}
	
	public void operate() {
		System.out.println("==Subject operate==");
		
		// 通知所有的观察者
		this.notifyObserver();
	}
	
}
