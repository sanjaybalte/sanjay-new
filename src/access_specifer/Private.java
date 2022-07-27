package access_specifer;

public class Private {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Private pu= new Private();
		pu.test1();// calling private method
		pu.test2();//default private method
		pu.test3();// protected private method
		pu.test4();// public private method
		
		
	}
	
	private void test1()
	{
		System.out.println("this is the private method");
	}
	
	void test2()
	{
		System.out.println("this is the default method");
	}
	
	protected void test3()
	{
		System.out.println("this is the protected method");
	}
	
	public void test4()
	{
		System.out.println("this is the public method");
	}
	
	
}
