package interview_code;

public class duplicate_NumfromArray {

	public static void main(String[] args) {
		// print duplicate number from array 
		int[] ar= {10,20,50,70,60,20,75,50,80};
		
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
				{
					{
						System.out.println(ar[i]+" ");
					}
				}
			}
		}
		
		
	}

}
