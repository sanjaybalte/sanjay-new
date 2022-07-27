package interview_code;

public class duplicate_stringfromArray {

	public static void main(String[] args) {

		// find duplicate string from array
		
		String arr[]= {"sanjay","vijay","sangita","shital","poonam", "vihan","sanjay","vijay"};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j= i+1;j<arr.length;j++)
			{
				if(arr[i].equals(arr[j]))
				{
					System.out.println(arr[j]);
				}
			}
		}
		
		
		
		
		
	}

}
