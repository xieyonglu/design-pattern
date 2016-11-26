package behavior.observer;

public interface ISubject {

	/**
	 * 添加观察者
	 * @param observer
	 */
	public void addObserver(IObserver observer);
	
	/**
	 * 通知所有的观察者
	 */
	public void notifyObserver();
	
	/**
	 * 操作方法
	 */
	public void operate();
	
}
