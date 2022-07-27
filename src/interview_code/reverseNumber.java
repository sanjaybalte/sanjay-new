package interview_code;

public class reverseNumber {

	public static void main(String[] args) {
		
		// Reverse a number
		
		int n= 152207; int rev=0;
		while(n>0)
		{
			rev = rev*10+n%10;
			
			n= n/10;
			
		}

		System.out.println(rev);

	}

}
