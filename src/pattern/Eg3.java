package pattern;

public class Eg3 {

	public static void main(String[] args) {
		
		// *
		// * *
		// * * *
		// * * * *
		// * * * * *
		
		// row 5  column 5
		
		int star=1;
		for(int i=1; i<=5; i++)// for row
		{
			for(int j=1;j<=star;j++)//column
			{
				System.out.print("*");
			}
			star++;
			System.out.println();
		}
		
		// inner loop only execute for first row only
		
	}

}
