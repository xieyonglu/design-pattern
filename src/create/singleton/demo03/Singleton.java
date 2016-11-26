package create.singleton.demo03;

/**
 * <h1>单例模式 - 懒汉模式的衍生型</h1>
 * @author yonglu.xie
 *
 */
public class Singleton {

	private static volatile Singleton singleton;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (singleton == null) {
			synchronized (singleton) {
				if (singleton == null) {
					return new Singleton();
				}
			}
		}

		return singleton;
	}

}
