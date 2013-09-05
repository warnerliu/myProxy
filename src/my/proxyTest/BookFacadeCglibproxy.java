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
	//�ص�����
	@Override
	public Object intercept(Object obj, Method method, Object[] args,
			MethodProxy proxy) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("before invoke method in cglib modle.");//�����ҵ���޹ص��ظ�����
		proxy.invokeSuper(obj, args);//ҵ����ķ���
		System.out.println("after invoke method in cglib modle");//�����ҵ���޹ص��ظ�����
		return null;
	}
	public Object getInstance(){
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(this.obj.getClass());
		//�ص����������õ���intercept�����������������ʵ�ַ�������ǿ
		enhancer.setCallback(this);
		//�����������
		return enhancer.create();
	}

}
