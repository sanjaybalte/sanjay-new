package pattern;

public class Eg12 {

	public static void main(String[] args) {
		
		//1		// *
		//2		// **
		//3		// ***
		//4		// ****
		//5		// *****
		//5		// ****
		//7		// ***
		//8		// **
		//9     // *
		
		// row 9
		// col 5
		
		
		
		int star=1;
		for(int i=1; i<=9; i++)// for row
		{
			for(int j=1;j<=star;j++)//column
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<=4)
			{
				star++;
			}
			else
			{
				star--;
			}
		}
		
		
		
		

	}

}
