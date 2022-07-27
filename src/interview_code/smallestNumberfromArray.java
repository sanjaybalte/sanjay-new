package interview_code;

public class smallestNumberfromArray {

	public static void main(String[] args) {

		// find smallest number from array
		int[] arr= {10,50,18,15,5,200,500,75};
		
		int min= arr[0];

		for(int i=1;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println(min);
	}

}
