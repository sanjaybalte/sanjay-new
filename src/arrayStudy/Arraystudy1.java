package arrayStudy;

public class Arraystudy1 {

	public static void main(String[] args)
	{
		// Ram Seeta Laxman
		String name[]= new String[30];// array declearization
		name[0]="Ram";// array initilization
		name[1]="Seeta";
		name[2]="Laxman";
		//name[3]="Ravan";
		//name[-1]="Bharat";
		
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
		System.out.println(name[3]);
		
		System.out.println("========================================");
		String name1[]= new String[30];// array declearization
		name1[0]="sanjay";// array initilization
		name1[1]="vijay";
		name1[2]="sangita";
		System.out.println(name1[0]);
		System.out.println(name1[1]);
		System.out.println(name1[2]);
		System.out.println(name1[3]);
		
		
		System.out.println("======================");
		for(int i=0;i<=2;i++) 
		{
			System.out.println(name[i]);
		}
			
		System.out.println("======================");
		for(int i=0;i<=name.length-1;i++)
		{
			System.out.println(name[i]);
		}
		System.out.println("======================");
		for(int i=name.length-1;i>=0;i--)
		{
			System.out.println(name[i]);
		}
		
	}

}
