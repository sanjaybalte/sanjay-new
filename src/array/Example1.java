package array;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// array is a data structure used to store homogeneous collection of information
//		String name1="ram";
//		String name2="shita";
//		
//		char grade1= 'A';
//		char grade2='B';
//		
//		int Roll1=1;
//		int Roll2=2;
		
		
		String ar[]=new String[4];
		
		ar[0]="Velocity";
		ar[1]="Corporation";
		ar[2]="Training";
		ar[3]="Center";
		
		System.out.println(ar.length);// 4
		
		System.out.println(ar[0]);// velocity
		
		
		System.out.println("================");
		
		
		
		for (int i=0; i<=3;i++)// 3 index
		{
			System.out.println(ar[i]);
		}
		System.out.println("================");
		for (int i=0; i<=ar.length-1;i++)//print upto 4-1 index
		{
			System.out.println(ar[i]);
		}
		System.out.println("================");
		for (int i=ar.length-1;i>=0;i--)// reverse index print
		{
			System.out.println(ar[i]);
		}
		
		
		
	}

}
