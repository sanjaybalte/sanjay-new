package thisAndsuperkeyword;

public class superUse extends Thisuse {

	int a= 500;   // non static global variable from sub class
	
	
	
	public static void main(String[] args) {
		
		superUse su = new superUse();
		su.addition();// call properties from Thisuse class
		su.sub();     // call non static properties from same class
		
		
		
		
		
	}
		public void sub()
		{
			int a=800;     //
			int sub =a-70;  // a local variable
			
			System.out.println("the sub is"+sub);
			
			int sub1= this.a-70;  // global variable from same class by using this keyword
			System.out.println("the sub is "+sub1); // 
			
			int sub2=super.a-70;   
			System.out.println("the sub is "+sub2);// global variable from superclass by using super keyword
		}
		
		
		
}
	


