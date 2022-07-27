package LogicalPrograms;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		//123--> 1^3+2^3+3^3=1+8+27 =36
		// 123 is not equal to 36 so its not a armstrong Number
		//if 123==36 the it is a armstrong number
		// ex. 153=153 armstrong number
		//the cube of induvidual number is same as that number
		//153--> 1^3+5^3+3^3=1+125+27 =153
		// if you want to take input from user taen take scanner class
		//Scanner sc = new Scanner(System.in);
		//System.out.println("please enter number");
		//int orgnum = sc.nextInt();
		int orgnum= 154154;
		int armNum=0;
		for(int i=orgnum;i>0;i=i/10)//153,15,1
		{
			int rem=i%10;//3,5,1
			armNum=armNum+(rem*rem*rem);
			// 27=0+27
			//152=27+125
			// 153=152+1
		}
		
		if(orgnum==armNum)// no string thats why we have taken ==// if string then take equals
		{
			System.out.println("given number "+orgnum+" is armstrong number");
		}
		else
		{
			System.out.println("given number "+orgnum+" is not armstrong number");
		}
	}
}
