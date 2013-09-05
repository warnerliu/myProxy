package my.proxyTest;

/**
 * @author Jacky
 *
 *在Cglib代理中，无需使用接口，在代理时生成该类的一个子类，并覆盖其中的方法，因为使用继承，所以该类不能用final修饰
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
