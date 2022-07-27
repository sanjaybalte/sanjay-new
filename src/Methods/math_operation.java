package Methods;

public class math_operation {

	public static void main(String[] args) {
		
		
		math_operation math=new math_operation();
		math.add(100, 200);
		
		math_operation m =new math_operation();
		m.multi(2, 4, 6, 8);

	}
	
	public void add(int a, int b)
	{
	
		int sum = a+b;
		System.out.println("the sum is "+sum);
	}
	
	public void multi(int a,int b,int c,int d)
	{
		int multiplication =a*b*c*d;
		System.out.println("multiplication is "+multiplication);
		
	}
}
