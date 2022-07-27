package interview_code;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args)
	{
//		01) // to take number and string input from using scanner
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		
		System.out.println("Enter a string");
		
		String str= sc.next();
		  // For taking array elements from the user;
		
		System.out.println("Enter the total number of element in the array");
		
		
		int limit= sc.nextInt();
			// for number array;
		for(int i=0;i<limit;i++) 
		{
		//	arr[i]=sc.nextInt();
		}
		
			// for string array;
		for(int i=0;i<limit;i++)
		{
		//	arr[i]=sc.nextInt();
		}

	}

}
