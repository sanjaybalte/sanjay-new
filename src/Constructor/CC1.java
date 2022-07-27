package Constructor;




public class CC1 {
	
	int a;
	int b;
	
	
	public CC1()  // user define zero parameter constructor
	{
		a=100;  // initilise variable
		b=200;  // insalise variable
	
	}
	
	public static void main(String[] args) {
		
		CC1 c1=new CC1();
		c1.addition();
		
		
		

	}
	public void addition()
	{
		//int a=10;
		//int b=20;
		int sub=a-b;
		System.out.println("sum is"+sub);
		
		
	}
}
