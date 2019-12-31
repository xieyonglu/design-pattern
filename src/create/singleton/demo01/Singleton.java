package create.singleton.demo01;

/**
 * <h1>单例模式 - 饿汉模式</h1>
 * 
 * @author yonglu.xie
 *
 */
public class Singleton {

	private static Singleton singleton;
	
	private Singleton() {
	}
	
	public static Singleton getInstance() {
		if(singleton == null) {
			singleton = new Singleton();
		}
		
		return singleton;
	}

}
