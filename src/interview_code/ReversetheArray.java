package interview_code;

import java.util.Arrays;

public class ReversetheArray {

	public static void main(String[] args) {
		
		// reverse the array
		
		int[] arr= {12,45,89,47,0,-12,-58,99,115,216};
		
		for(int i=0;i<arr.length/2;i++)
		{
			int temp =arr[arr.length-i-1];
			arr[arr.length-i-1]=arr[i];
			arr[i]=temp;
		}
		
		
		System.out.println(Arrays.toString(arr));
		

	}

}
