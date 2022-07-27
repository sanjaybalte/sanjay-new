package Constructor;

public class CC2 {
	int a;
	int b;
	

	public CC2()
	{
		int a=100;// initialize variable
		int b=200;
		
	}
	public CC2(int x)// constructor with parameter
	{
		
		a=x;
		
	}
	public CC2(int x,int y)
	{
		a=x;
		b=y;
		
	}
	public static void main(String[] args) {
		
		CC2 c2=new CC2();
		c2.add();
		CC2 c12 =new CC2(1050);
		c12.add();
		CC2 c13=new CC2(5000,300);
		c13.add();
		
	}
	public void add ()
	{
		int a=1055;
		int b=15225;
		int sum;
		sum=a+b;
		System.out.println("sum is equal to "+sum);
	}
}
