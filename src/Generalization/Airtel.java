package Generalization;

public class Airtel implements TRAI {

	@Override
	public void call() 
	{
		System.out.println("0.5 rs/sec ");		
	}

	@Override
	public void msg()
	{
		System.out.println("1 rs/msg ");
		
	}

	@Override
	public void videocall() 
	{
		System.out.println("1.5 rs/min ");
		
	}

	public void newmethod_Airtel()
	{
		System.out.println("this is airtel new method");
	}
	
	
}
