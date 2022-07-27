package interfacestudy;

public class Myclass implements Myinterface {

	public static void main(String[] args) 
	{

		Myclass m = new Myclass();
		m.test();
		m.test1();
		m.Mymethod();
		//a=a+10;// we cant update variable from interface
		System.out.println("value of a is "+a);
		

	}

	@Override
	public void test()
	{
		System.out.println("hi this method complete in in implementation class");
		
	}

	@Override
	public void test1()
	{

		System.out.println("hi this method complete in in implementation class");
		
	}
	public void Mymethod()
	{
		System.out.println("this is myclass method");
	}
}
