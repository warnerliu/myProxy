package my.proxyTest;

/**
 * @author Jacky
 *
 *�ӿڵľ���ʵ���࣬��̬������Դ�������ʵ�ָýӿڵľ�����
 *
 */
public class BookFacadeImpl implements BookFacade {

	@Override
	public void addBook(int var) {
		// TODO Auto-generated method stub
		System.out.println("add book method."+var);

	}

	@Override
	public void addBook() {
		// TODO Auto-generated method stub
		System.out.println("add book method without args.");
	}

	@Override
	public void addBook(int var, String str) {
		// TODO Auto-generated method stub
		System.out.println("add book method with two args."+var+":"+str);
	}

	@Override
	public void subBook() {
		// TODO Auto-generated method stub
		System.out.println("sub book method.");
	}

}
