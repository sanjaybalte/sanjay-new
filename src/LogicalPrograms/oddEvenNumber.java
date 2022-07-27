package LogicalPrograms;

import java.util.Scanner;

public class oddEvenNumber {

	public static void main(String[] args) {

//		System.out.println(10/2);
//		System.out.println(10%2);// it gives reminder 
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number");
		
		int a = sc.nextInt();
		
		if(a%2==0)
		{
			System.out.println(" given number is even ");  
		}
		else
		{
			System.out.println(" given number is odd ");
		}
		
		
//		int a= 25;
//		
//		if (a%2==0)
//		{
//			System.out.println("even number");
//		}
//		else
//		{
//			System.out.println("odd number");
//		}
		
		
		
	}

}
