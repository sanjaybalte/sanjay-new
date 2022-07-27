package Methods;

public class mathoperation {

	public static void main(String[] args) {
		
		mathoperation math =new mathoperation();//object create
		math.add();
		mathoperation substration=new mathoperation();
		substration.sub();
		div();
		mathoperation multip=new mathoperation();
		multip.mul();
		
	}

	public void add()
	{
		int a;
		int b;
		int addition;
		
		
		a=100;
		b=200;
		addition=a+b;
		System.out.println("addation is "+addition);
		
	}
	
	public static void sub()
	{
		int a=100;
		int b=50;
		int sub =a-b;
		System.out.println("substration is "+sub);
	}
	
	public static void div()
	{
		int a=100;
		int b=8;
		float div=a/b;
		System.out.println("division is "+div);
		
	}
	
	public void mul()
	{
		float a=10.550f;
		int b=2110;
		double multi=a*b ;
		System.out.println("multiplication is "+multi);
	}
}
