package interview_code;

public class stringrevrse {

	public static void main(String[] args) {
		// palindrom name is name when we reverse it it looks like same
		
		String str= "python";
		String rev = "";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev= rev+str.charAt(i);
		}
		System.out.println(rev);
	}

}
