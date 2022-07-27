package thisAndsuperkeyword;

public class Thisuse {
	
	int a=100; // non static global variable
	int b=200;
	//static int c=300; // we cant create static variable same name in the same class
	
	
	public static void main(String[] args)
	{
		
		Thisuse t = new Thisuse();
		t.addition();
		
		
		
		
		
	}
	
	public void addition()
	{
		int a=10;// local variable
		int sum = a+900;       // a value will be refer as local 
		//static int c=20; //
		System.out.println("addition is "+sum);
		int sum1= this.a+900;    // a value will be refer as global due to this keyword
		System.out.println("addition is "+sum1);
		
		
		
	}
	
	
	
}
