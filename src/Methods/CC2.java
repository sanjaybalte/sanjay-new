package Methods;

public class CC2 {

	public static void demo()
	{
		System.out.println("hi this is method calling from another calss");
		System.out.println("hi this is static method from other class");
		
	}
	
	public static void demo1()
	{
		int a=15600;
		int b=6400;
		int c= 35000;
		int gross=a+b+c;
		System.out.println("the sum is "+gross);
		
		
	}
	public static void demo3()
	{
		int a=15;
		float b= (float) 15.2;
		float multi_c=a*b;
		System.out.println("the multiplication is "+multi_c);
		
		
	}
	public void mul()
	{
		int a=20;
		int b=30;
		int mul=a*b;
		System.out.println("multiplication of nonststic method from another class is "+mul);
	}
	
	public void rama()
	{
		String Studentname="rama";
		int marks =25;
		char grade= 'A';
		double Percentage= 65.25;
		
		System.out.println("***********************************");
		System.out.println("---------------------------------");
		System.out.println("Name of the student is "+Studentname);
		System.out.println("marks of the student is "+marks);
		System.out.println("grade of the student is "+grade);
		System.out.println("percentage of the student is "+Percentage);
		System.out.println("---------------------------------");
		System.out.println("***********************************");
		
	}
}
