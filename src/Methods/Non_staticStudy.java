package Methods;

public class Non_staticStudy {

	public static void main(String[] args) {

		Non_staticStudy obj=new Non_staticStudy();	
		obj.display();
		Non_staticStudy non_d=new Non_staticStudy();
		non_d.non_display();
		myclass run=new myclass();
		run.running();
		myclass swim = new myclass();
		swim.swimming();
		
		
		
		
		
		
	}

	public void display()
	{
		System.out.println("this is non static methay");
		System.out.println("non static method calling from same class using object");
	}
	
	public void non_display()
	{
		System.out.println("this is non static non display method");
	}
	
	
}
