package LogicalPrograms;

import java.util.Scanner;

import interview_code.scanner;

public class ReverseString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("please enter string to reverse");
		
		String a = sc.next();
		String b=" ";
		
		for(int i= a.length()-1;i>=0;i--)
		{
			b=b+a.charAt(i);
		}
		System.out.println("Original string is "+a);
		System.out.println("Reverse string is "+b);
	}

}
