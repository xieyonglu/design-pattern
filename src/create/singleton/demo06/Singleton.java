package create.singleton.demo06;

import java.util.concurrent.atomic.AtomicReference;

/**
 * <h1>单例模式 - CAS乐观锁</h1>
 * 	用CAS的好处在于不需要使用传统的锁机制来保证线程安全，CAS是一种基于忙等待的算法，依赖底层硬件的实现，相对于锁它没有线程切换和阻塞的额外消耗，可以支持较大的并行度。
 * 	CAS的一个重要缺点在于如果忙等待一直执行不成功(一直在死循环中)，会对CPU造成较大的执行开销。
 * 	另外，如果N个线程同时执行到singleton = new Singleton(); 的时候，会有大量对象创建，很可能导致内存溢出。
 * 
 * @author yonglu.xie
 * @date 2019/12/31
 *
 */
public class Singleton {

	private static final AtomicReference<Singleton> INSTANCE = new AtomicReference<>();
	
	
	private Singleton() {}
	
	
	public Singleton getInstance() {
		for(;;) {
			Singleton singleton = INSTANCE.get();
			
			if(null != singleton) {
				return singleton;
			}
			
			singleton = new Singleton();
			
			if(INSTANCE.compareAndSet(null, singleton)) {
				return singleton;
			}
		}
	}

}
