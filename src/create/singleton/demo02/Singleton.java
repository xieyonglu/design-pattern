package create.singleton.demo02;

/**
 * <h1>单例模式 - 懒汉模式</h1>
 * 
 * @author yonglu.xie
 *
 */
public class Singleton {

	private static Singleton singleton;
	
	private Singleton() {
	}
	
	public static synchronized Singleton getInstance() {
		if(singleton == null) {
			singleton = new Singleton();
		}
		
		return singleton;
	}

}
