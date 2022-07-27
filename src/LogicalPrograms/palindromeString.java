package LogicalPrograms;

import java.util.Scanner;

public class palindromeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a string ");
		
		String org = sc.next();
		String rev="";
		
		for(int i= org.length()-1;i>=0;i--)
		{
			rev=rev+org.charAt(i);
		}
		System.out.println("Original string is "+org);
		System.out.println("Reverse string is "+rev);
		
		if(org.equals(rev))
		{
			System.out.println("given string is palindrome");
		}
		else
		{
			System.out.println("given string is not palindrome");
		}
	}

}

		
		
	
		
		
		
		
		
		
		
		
		
		
		
		

