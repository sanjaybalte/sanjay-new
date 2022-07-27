package variable_types;



public class test {
	int a=10;
	int b=20;
	
	public static void main(String[] args)
	
	{
		test b = new test();// we create object of non ststic variable in same class
		b.add();
		System.out.println(b.a);
		System.out.println(b.b);
		multi();
		
	}
	
	public void add()
	{
		int a=100;
		int b=200;
		int sum=a+b;
		System.out.println(sum);
		
		int sum1=this.a+this.b;
		System.out.println(sum1);
		
	}
	
	public static void multi()
	{
		int a=15;
		int b=20;
		
		int mul= a*b;
		System.out.println(mul);
		
		
		
	}
}
