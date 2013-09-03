/**
 * 
 */
package my.proxyTest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Jacky
 *
 */
public class BookFacadeProxy implements InvocationHandler {

	/* (non-Javadoc)
	 * @see java.lang.reflect.InvocationHandler#invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[])
	 */
	private Object obj;
	BookFacadeProxy(Object obj){
		this.obj = obj;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("before method invoke.");
		Object result = method.invoke(obj, args);
		System.out.println("after method invoke.");
		return result;
	}
	public Object getProxyObject(){
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
	}

}
