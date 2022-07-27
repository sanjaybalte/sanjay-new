package access_specifer;

public class variables {

	private static int a=100;  //  static global variable
	int  b=200;           // non static global variable
	protected int c =300; // non static global variable
	public int d=400;   // non static global variable
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		variables v = new variables(); // create object of non static global variable
		
		System.out.println(a);   // calling static global variable from same class
		System.out.println(v.b); // calling non static global variable from same class
		System.out.println(v.c); // calling non static global variable from same class
		System.out.println(v.d); // calling non static global variable from same class
		
		
	}

}
