package array;

public class sample11 {

	public static void main(String[] args) {
		
		int ar[]= new int[6];
		ar[0]=10;
		ar[1]=25;
		ar[3]=35;
		ar[4]=55;
		ar[5]=95;
		
		int max=ar[0];
		for(int i=0;i<ar.length-1;i++)
				{
		   if(ar[i]>max)
		   {
			   max=ar[i];
		
		   }
			
			System.out.println(ar[i]);
		}
		
		
		
	}

}
