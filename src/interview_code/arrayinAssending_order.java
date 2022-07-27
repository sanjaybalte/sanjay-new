package interview_code;

import java.util.Arrays;

public class arrayinAssending_order {

	public static void main(String[] args) {
		//short array in assending order

		int[] arr= {12,45,89,47,-12,-58,99,115,255,15,18,24};
		for(int i=0; i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp =arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
