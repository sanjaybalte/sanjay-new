package array;

public class multiExample {

	public static void main(String[] args) {

		int ar[][]= {{10,20,30},{40,50,60},{70,80,90}};
		System.out.println(ar[0][2]);//30
		System.out.println(ar[1][1]);//50
		
		for (int i=0;i<=2;i++)// for row
		{
			for(int j=0;j<=2;j++)// for column
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("==============");
		
		int ary[][]= {{1,2,3,100},{4,5,6,200},{7,8,9,300}};
		for(int k=0;k<=3;k++)
		{
			for (int l=0;l<=3;l++)
			{
				System.out.print(ary[k][l]+" ");
			}
			System.out.println();
			
		}
		
		
		
		
	}

}
