package my.proxyTest;

/**
 * @author Jacky
 *
 *��Cglib�����У�����ʹ�ýӿڣ��ڴ���ʱ���ɸ����һ�����࣬���������еķ�������Ϊʹ�ü̳У����Ը��಻����final����
 *
 */

public class BookFacadeCglib {
	public void addBook(){
		System.out.println("this is a new class without implements a Interface.");
	}
	public void subBook(){
		System.out.println("cglib proxy method.");
	}

}
