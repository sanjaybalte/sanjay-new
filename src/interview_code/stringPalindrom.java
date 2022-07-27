package interview_code;

public class stringPalindrom {

	public static void main(String[] args) {

		
		String str = "madam";
		String org=str;
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev= rev+str.charAt(i);
		}
		if(org.equals(rev))
		{
			System.out.println("string is palindrom");
		}
		else
		{
			System.out.println("string is not palindrom");
		}
		
		
		
	}

}
