package interview_code;

public class factorial_ofNumber {

	public static void main(String[] args) {
		// factorial of a number e.g. 3=3*2*1=6
		
		int n = 3;
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact = fact*i;
			
		}
		System.out.println(fact);
		
		System.out.println("======================");
		
		
		// factorial of a number e.g. 15=15*14*13......*2*1=
		
		int n1= 15; int fact1=1;
		
		for (int j =1; j<=n1;j++)
		{
			fact1=fact1*j;
		}
		
		System.out.println(fact1);
		
		
	}

}
