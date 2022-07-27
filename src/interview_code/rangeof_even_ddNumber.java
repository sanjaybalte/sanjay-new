package interview_code;

public class rangeof_even_ddNumber {

	public static void main(String[] args) {
		// printing range of even numbers
		
		int n =15;
		System.out.println("Even numbers; ");
		for(int i=0;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println(" "+i);
			}
		}
		

		// printing range of odd numbers
		
		int odd =17;
		System.out.println("odd numbers: ");
		
		for(int j=0;j<=odd;j++)
		{
			if(j%2!=0)
			{
				System.out.println(" "+j);
			}
		}
		
		
		
	}

}
