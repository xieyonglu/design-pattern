package structure.proxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * CGLibProxy动态代理
 * @author yonglu.xie
 *
 */
public class CGLibProxy implements MethodInterceptor {

	private Object targetObject; // CGLib需要代理的目标对象
	
	public Object createProxyObject(Object obj) {
		this.targetObject = obj;
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(obj.getClass());
		enhancer.setCallback(this);
		
		Object proxyObj = enhancer.create();
		return proxyObj;
	}
	
	@Override
	public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		this.method();
		Object obj = method.invoke(targetObject, args);
		this.method();
		
		return obj;
	}
	
	private void method() {
		System.out.println("-----method-----");
	}

}
