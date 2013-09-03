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
		BookFacade bookProxy = (BookFacade)dynamicProxy.getProxyObject();
		bookProxy.addBook();

	}

}
