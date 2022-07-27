package array;

import java.util.Arrays;

public class Example5 {

	public static void main(String[] args) {

		int money[]= new int[6];
		money[0]=50;
		money[1]=20;
		money[2]=10;
		money[3]=40;
		money[4]=30;
		money[5]=60;
		
		System.out.println("ORIGINAL OUTPUT");
		
		for (int i=0; i<=5;i++)
		{
			System.out.println(money[i]);
		}
		
		System.out.println("==================");
		
		Arrays.sort(money);
		System.out.println("sorted array");
		
		for (int i=0;i<=5;i++)
		{
			System.out.println(money[i]);
		}
		System.out.println("============");
		for (int i=0;i<=money.length-1;i++)
		{
			System.out.println(money[i]);
		}
		
		System.out.println("print decending order");
		
		for(int i=5;i>=0;i--)
		{
			System.out.println(money[i]);
		}
		
		
	}

}
