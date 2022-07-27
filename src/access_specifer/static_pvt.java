package access_specifer;

public class static_pvt {

	public static void main(String[] args) {
		
		demo1();  // call static private from same class
		demo2();  // call static default from same class
		demo3();  // call static protected from same class
		demo4(); // call static public from same class
	}

	private static void demo1()
	{
		System.out.println("this is private method");
	}
	
	static void demo2()
	{
		System.out.println("this is default method");
	}
	
	protected static void demo3()
	{
		System.out.println("this is protected method");
	}
	
	public static void demo4()
	{
		System.out.println("this is public method");
	}
	
}
