package interview_code;

public class find_largestNumfrom_atrray {

	public static void main(String[] args) {
		// Find largest number from array

		int arr[]= {1000,20,65,85,42,100,544,600,25,-30};
		
		int max=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		
		System.out.println(max);
	}

}
