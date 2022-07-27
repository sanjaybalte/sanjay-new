package Generalization;

public class GeneralizationStudy  {

	public static void main(String[] args)
	{

		// TRAI t = new TRAI();
		// we cant create a object of TRAI becoz of incopmlete method
		
		System.out.println("==========Airtel==========================");
		
		Airtel a = new Airtel();
		a.call();
		a.msg();
		a.videocall();
		a.newmethod_Airtel();
		System.out.println("==================Jio=============");
		Jio j = new Jio();
		j.call();
		j.videocall();
		j.msg();
		j.newjio_method();
		
		System.out.println("=============VI====================");
		
		VI v = new VI();
		v.call();
		v.msg();
		v.videocall();
		v.newmwthod_VI();
		
		
		
	}

}
