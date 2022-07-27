package Constructor;

public class C1 {
	int a;
	int b;
	
	public static void main(String[] args) {
		
		C1 c1=new C1();
		c1.add();
		
		C1 c2=new C1(900);
		c2.add();
		
		C1 c3 =new C1(100,500);
		c3.add();
		
		C1 c22=new C1(500,1524);
		c22.add();
		
		
		
	}
	
	public C1()
	{
		a=100;
		b=200;
		
	}
	public C1(int x)
	{
		a=x;
	}
	public C1(int x, int y)
	{
		a=x;
		b=y;
	}
	public void add()
	{
		int sum=a+b;
		System.out.println("the sum is "+sum);
	}
}
