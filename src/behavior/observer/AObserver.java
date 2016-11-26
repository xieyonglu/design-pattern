package behavior.observer;

public class AObserver implements IObserver {

	@Override
	public void update() {
		System.out.println("==AObserver update==");
	}

}
