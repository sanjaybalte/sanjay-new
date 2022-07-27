package array;

public class multi {

	
	public static void main(String[] args) {

		char grade[][]= {{'A','B','X'},{'C','D','Y'}};
		for (int i=0;i<=grade.length-1;i++)// this is outer loop for row
		{
			for(int j=0;j<=grade.length-1;j++);// this is inner loop for column
			{
				System.out.print(grade[i]+" ");
			}
		System.out.println();
		}
		
		
		
	}

}
