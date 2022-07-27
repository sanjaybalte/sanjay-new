package Constructor;

public class Userdefineconstructor {

	
	public Userdefineconstructor()
	{
		System.out.println("hi this is userdefine constructor");
		int c=20;
		int d=30;
		System.out.println("value of c is "+c);
		System.out.println("value of d is "+d);
	
	}
	
	public static void main(String[] args) {
		
		Userdefineconstructor ud=new Userdefineconstructor();
		//ud.test();
		
		
	}

	public void test()
	{
	
	System.out.println("hi this is test method");
	
	}
	
}
