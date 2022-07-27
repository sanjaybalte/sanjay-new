package interview_code;

public class fibonacci_series {

	public static void main(String[] args) {
		//fibonacci_series print
		
		int n=8;
		System.out.println("fibonacci numbers; ");
		
		int a=0; int b=1;
		int c;
		
		System.out.println(" "+a+" "+b);
		
		for(int i=0; i<n;i++)
		{
			c=a+b;
			a=b;// swaping number--->logical program
			b=c;
			System.out.println(" "+c+" ");
		}

		
		

	}

}
