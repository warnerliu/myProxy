/**
 * 
 */
package my.proxyTest;

/**
 * @author Jacky
 * 
 * 
 * 接口的具体实现类，可以有不同的实现版本
 *
 */
public class BookFacadeImplOther implements BookFacade {

	/* (non-Javadoc)
	 * @see my.proxyTest.BookFacade#addBook(int)
	 */
	@Override
	public void addBook(int var) {
		// TODO Auto-generated method stub
		System.out.println("another version implements with int var"+var);

	}

	/* (non-Javadoc)
	 * @see my.proxyTest.BookFacade#addBook()
	 */
	@Override
	public void addBook() {
		// TODO Auto-generated method stub
		System.out.println("another version implements without args.");

	}

	/* (non-Javadoc)
	 * @see my.proxyTest.BookFacade#addBook(int, java.lang.String)
	 */
	@Override
	public void addBook(int var, String str) {
		// TODO Auto-generated method stub
		System.out.println("another version implements with int and string var"+var+":"+str);

	}

	@Override
	public void subBook() {
		// TODO Auto-generated method stub
		System.out.println("another version sub book method.");
	}

}
