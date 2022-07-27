package Abstractclass;

public class CC extends AbstractStudy {

	public static void main(String[] args)
	{
		CC c = new CC();  // created object of concrete class
		c.sample();   // CC method
		c.test(); // CC Method
		c.test1(); // Abst method
		c.test2();  // Abst method
		
		
		
		
	
		
	}

	@Override
	public void test()
	{
		System.out.println("this method is complete in concrete class");
		
	}
	public void sample()
	{
		System.out.println("this is the own method of cc");
	}
}
