package thisAndsuperkeyword;

public class sample {

	int a=500;  // global non static variable variable
	int b=200; // global non static variable variable
	int c=100; // global non static variable variable
	
	
	
	public static void main(String[] args) {
		
		sample ad = new sample();
		ad.addition();
		
		
		
		
	}

	public void addition()
	{
		int a=10;
		int b=20;
		int c=30;
		int sum= a+b+c;  // calling local variable from same class	
		System.out.println("the addition is "+sum);
		
		int sum1=this.a+this.b+c;
		System.out.println("the addition is "+sum1);// calling a,b global by using this keyword & c is a local variable
		
		
		
	}
	
	
	
}
