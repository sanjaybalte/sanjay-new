package interview_code;

public class prime_number {

	public static void main(String[] args) {
		// prime number is that number greter than one and that is not product of two number
		int n=17;
		int temp=0;
		
		for (int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				temp++;
			}
		}

		if(temp==0)
		{
			System.out.println("number is prime " +n);
		}
		
		

	}

}
