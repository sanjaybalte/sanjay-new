package Methods;

public class CC3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CC3 non_s=new CC3();
		non_s.sum();
		CC3 s= new CC3();
		s.sum1();
		
		CC3 m= new CC3();
		m.m();
		
		CC3 div=new CC3();
		div.d();
		
		CC2 m1=new CC2();
		m1.mul();
		
		CC2 ramrajya =new CC2();
		ramrajya.rama();
				
		
		
	}
	
	public void sum()
	{
		System.out.println("hi iam non static method from the same calss");
	}
	public void sum1()
	{
		int a=1524;
		int b=6256;
		int sum=a+b;
		System.out.println("the sumesion of nonststic method from the same class is "+sum);
	}
	
	public void m()
	{
		int a= 15;
		int b= 30;
		int multiplication=a*b;
		System.out.println("the multiplication for non ststic method from same class is "+multiplication);
	}
	
	public void d()
	{
		int a=58000;
		int b=22;
		int division=a/b;
		System.out.println("the division for nonstatic method from the same class is "+division);
	}
}
