package behavior.observer;

import java.util.LinkedList;
import java.util.List;

public abstract class AbstractSubject implements ISubject {

	private List<IObserver> observers = new LinkedList<>();

	public void addObserver(IObserver observer) {
		observers.add(observer);
	}

	public void notifyObserver() {
		for (IObserver observer : observers) {
			observer.update();
		}
	}

}
