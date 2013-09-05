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
 *��̬������
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
	
	//��invoke�����У����������Ӧ�Ĵ��룬AOP�Ļ�ʯ
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("before method invoke.");//��AOP�У�ʵ����־��¼����֤�������ҵ����������ܵķ���
		//args���������б�
		if(null != args)
		{
			for(int i = 0; i < args.length;i++)
				System.out.println(args[i]);
		}	
		Object result = method.invoke(obj, args);//���ĵ�ҵ�񷽷�
		System.out.println("after method invoke.");//��ҵ����������ܵķ���ʵ��
		return result;
	}
	public Object getProxyObject(){
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
	}

}
