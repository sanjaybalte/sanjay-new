package Constructor;

public class class2 {
	int a=10;
	int b=30;
	int c=1;
	public class2(int a,int b, int c)
	{
		
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class2 m= new class2();
		m.add();
		class2 s =new class2();
		s.add();
		class2 b=new class2(10,20,30);
		b.add();
		
		
	}
	
	public void add()
	{
		int a=20;
		int b=30;
		int c=a+b;
		System.out.println("the addition is "+c);
		
		
	}
	
	public class2()
	{
		 a=100;
		 b=200;
		 c=100;
		System.out.println("print value is "+b);
		
	}
}
