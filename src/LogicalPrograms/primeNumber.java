package LogicalPrograms;

public class primeNumber {

	public static void main(String[] args) {
		// 4-->
		
		int num=11;
		
		int count=0;
		
		for(int i=2;i<num;i++)//2,3,..10
		{
			if(num%i==0)
			{
				count++;
				break;
				
			}
		}
		if(count==1)
		{
			System.out.println("given number is not a prime number");
		}
		else
		{
			System.out.println("given number is  prime number");
		}
		
	}

}
