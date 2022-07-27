package LogicalPrograms;

public class ReverseNumber {

	public static void main(String[] args) {

		int num = 125;
		
		String strNum = Integer.toString(num);// convert int to string
		String rev="";
		
		for(int i=strNum.length()-1;i>=0;i--)
		{
			rev=rev+strNum.charAt(i);
		}
		int revNum = Integer.parseInt(rev);
		System.out.println("original number is "+num);
		System.out.println("reverse number is "+revNum);
		
	}

}
