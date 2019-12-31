package create.singleton.demo04;

/**
 * <h1>单例模式 - 枚举</h1>
 * 
 * @author yonglu.xie
 * @date 2019/12/31
 *
 */
public class Singleton {

	// 私有化构造函数
	private Singleton() {
	}

	// 定义一个静态枚举类
	static enum SingletonEnum {
		// 创建一个枚举对象，该对象天生为单例
		INSTANCE;

		private Singleton singleton;

		// 私有化枚举的构造函数
		private SingletonEnum() {
			singleton = new Singleton();
		}

		public Singleton getInstance() {
			return singleton;
		}
	}

	// 对外暴露一个获取Singleton对象的静态方法
	public static Singleton getInstance() {
		return SingletonEnum.INSTANCE.getInstance();
	}

	public static void main(String[] args) {
		System.out.println(Singleton.getInstance());
		System.out.println(Singleton.getInstance());
		System.out.println(Singleton.getInstance() == Singleton.getInstance());
	}

}
