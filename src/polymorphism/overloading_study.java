package polymorphism;

public class overloading_study {

	public void demo()
	{
		
		int a=20;
		int b =30;
		int sum =a+b;
		System.out.println("the sum is  "+sum);
	}
	
	public void demo (int a, int b)
	{
		a=100;
		b=200;
		int sum=a+b;
		System.out.println("the sum is "+sum);
		
	}
	
	public static void demo(int a, int b, int c)
	{
		a=1000;
		b=2000;
		c=3000;
		int sum= a+b+c;
		
		System.out.println("the sum is "+sum);
	}
	
	
	
	
	
	
	
	
}
