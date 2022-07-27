package Abstractclass;

public class CC1 extends Abstract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CC1 c1 = new CC1();// object created for concrete class
		c1.demo();
		c1.demo1();
		c1.demo2();
		c1.sample();
		
		
		
	}

	public void demo() 
	{
		System.out.println("this demo method");
	}
	
	public void sample()
	{
		System.out.println("this is demo3 method from concrete class");
	}
	
	
	
	
	
}
