/**
 * 
 */
package my.proxyTest;

/**
 * @author Jacky
 *
 *使用Java中的动态代理时，被代理类必须实现相同的接口，否则不能使用JDK中的动态代理
 *
 */
public interface BookFacade {
	public void addBook(int var);
	public void addBook();
	public void addBook(int var,String str);
	public void subBook();

}
