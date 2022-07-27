package Generalization;

public class Jio implements TRAI {

	@Override
	public void call()
	{
		System.out.println("1 paisa per secc");
		
	}

	@Override
	public void msg() 
	{
		System.out.println("0.5 pasa per msg");
		
	}

	@Override
	public void videocall() 
	{
		System.out.println("free");
		
	}
	
	public void newjio_method()
	{
		System.out.println("this is jio new mwthod");
	}
	
	
}
