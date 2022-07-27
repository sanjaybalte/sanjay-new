package polymorphism;

public class sample {

	public static void main(String[] args)
	{
		
		add(10,50,30);
		sample s = new sample();
		s.add();
		s.add(150, 200);
		s.add(15, 150, 254);
		
		
		
		
	}
	public void add()
	{
		int a=20;
		int b=30;
		int sum1=a+b;
		System.out.println("the sum is " +sum1);
	}
	public void add(int a, int b) 
	{
		 int sum = a+b;
		
		System.out.println("the sum is "+sum);
	}
	public static void add(int a, int b, int c)
	{
		int sum= a+b+c;
		System.out.println("the sum is "+sum);
	}
}
