package Methods;

public class CC1 {

	public static void main(String[] args) {


	System.out.println(" hi this is a simle method");
	CC1 c=new CC1();
	c.add();
	CC1 c1=new CC1();
	c1.sub();
	CC1 d=new CC1();
	d.div();
	demo();// in static method call from same calss just write methodname()
	demo1();
	CC2.demo();
	CC2.demo1();
	CC2.demo3();
	
	
	
	}
	public static void add ()
	{
		int a=100;
		int b=2050;
		int sum=a+b;
		System.out.println("the sum = "+sum);
		
		
	}
	public static void sub()
	{
		int a=310;
		int b=140;
		int substration=a-b;
		System.out.println("the substration of a& b is "+substration);
		
		
	}
	public static void div()
	{
		int a=45454;
		int b=50;
		float division=a/b;
		System.out.println("the dividion is "+division);
	}
	public static void demo()
	{
		int a=15;
		int b=50;
		int multiplication =a*b;
		System.out.println("the multiplication value is"+multiplication);
		
	}
	public static void demo1()
	{
		int a=10;
		int b=20;
		int c=30;
		int d=40;
		int sum =a+b+c+d;
		System.out.println("the sum is "+sum);
		
	}
}
