package structure.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK动态代理
 * @author yonglu.xie
 *
 */
public class JdkProxy implements InvocationHandler {

	private Object targetObject; // 需要代理的目标对象
	
	public Object newProxy(Object targetObject) {
		this.targetObject = targetObject;
		return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(), targetObject.getClass().getInterfaces(), this); // 返回代理对象
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		this.method();
		Object ret = method.invoke(targetObject, args);
		this.method();
		
		return ret;
	}
	
	private void method() {
		System.out.println("-----method-----");
	}
	
}
