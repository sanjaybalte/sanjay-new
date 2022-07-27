package variable_types;



public class global_variable {
		int a=105;// global non static variable
		static int b=200;  //global static variable
	
	
	
	public static void main(String[] args) {
		
		global_variable g = new global_variable();
		g.test();
	
		test1();
		
		
	}
	
	public void test()
	{
		int sum=a+10;
		int sub=b-a;// b is on static variable
		System.out.println(sum);
		System.out.println(sub);
		
		
	}
	public static void test1()
	{
		// int sum=a+10;    // a is non static variable
		
		int sub=b-10;
		System.out.println(sub);
		
		int addition=500+b;
		System.out.println(addition);
		
		
		
	}
}
