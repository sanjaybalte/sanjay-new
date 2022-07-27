package interview_code;

public class palindrom_number {

	public static void main(String[] args) {
		// palindrom number is that number when we 
		//reverse them looks same as original
		
		int n=232; int org=n; int rev=0; 
		
		while(n>0)
		{
			rev=rev*10+n%10;
			n=n/10;
			
		}
		if(org==rev)
		{
			System.out.println("number is palindrom");
		}
		else
		{
			System.out.println("number is not palindrom");
		}
	}

}
