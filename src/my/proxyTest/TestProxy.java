/**
 * 
 */
package my.proxyTest;

/**
 * @author Jacky
 *
 */
public class TestProxy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookFacadeProxy dynamicProxy = new BookFacadeProxy(new BookFacadeImpl());
		BookFacade bookProxy = (BookFacade)dynamicProxy.getProxyObject();//使用接口对象调用相应的方法
		bookProxy.subBook();
		bookProxy.addBook(5);
		bookProxy.addBook();
		bookProxy.addBook(3, "args");
		System.out.println("-----------------------------");
		BookFacadeProxy anotherProxy = new BookFacadeProxy(new BookFacadeImplOther());
		bookProxy = (BookFacade)anotherProxy.getProxyObject();
		bookProxy.addBook();
		bookProxy.addBook(10);
		bookProxy.addBook(8, "version2");
		System.out.println("------------------------------");
		BookFacadeCglibproxy cglibProxy = new BookFacadeCglibproxy(new BookFacadeCglib());
		BookFacadeCglib bookCglib = (BookFacadeCglib)cglibProxy.getInstance();//不依赖接口，直接使用实际类
		bookCglib.addBook();
		bookCglib.subBook();

	}

}
