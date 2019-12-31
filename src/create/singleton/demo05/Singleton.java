package create.singleton.demo05;

/**
 * <h1>单例模式 - 静态内部类</h1>
 * 
 * @author yonglu.xie
 * @date 2019/12/31
 *
 */
public class Singleton {

	public static class SingletonHolder {
		private static final Singleton INSTANCE = new Singleton();
	}

	private Singleton() {
	}

	public static final Singleton getInstance() {
		return SingletonHolder.INSTANCE;
	}

}
