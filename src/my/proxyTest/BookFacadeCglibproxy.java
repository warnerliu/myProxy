/**
 * 
 */
package my.proxyTest;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * @author Jacky
 *
 */
public class BookFacadeCglibproxy implements MethodInterceptor {

	/* (non-Javadoc)
	 * @see net.sf.cglib.proxy.MethodInterceptor#intercept(java.lang.Object, java.lang.reflect.Method, java.lang.Object[], net.sf.cglib.proxy.MethodProxy)
	 */
	private Object obj;
	BookFacadeCglibproxy(Object obj){
		this.obj = obj;
	}
	//回调方法
	@Override
	public Object intercept(Object obj, Method method, Object[] args,
			MethodProxy proxy) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("before invoke method in cglib modle.");//与具体业务无关的重复操作
		proxy.invokeSuper(obj, args);//业务核心方法
		System.out.println("after invoke method in cglib modle");//与具体业务无关的重复操作
		return null;
	}
	public Object getInstance(){
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(this.obj.getClass());
		//回调方法，调用的是intercept方法，在这个方法中实现方法的增强
		enhancer.setCallback(this);
		//创建代理对象
		return enhancer.create();
	}

}
