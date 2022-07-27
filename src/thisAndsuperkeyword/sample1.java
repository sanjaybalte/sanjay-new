package thisAndsuperkeyword;

public  class sample1 extends sample {

	int a=300;
	
	
	
	public static void main(String[] args) 
	{
		sample a = new sample();// object create of child class// another class
		a.addition();   // calling addition method from different class or parents class
		
		sample1 b = new sample1();
		b.summ();
		
		
		
	}

	public void summ()
	{
		
		 int a=15;
		 int b=17;
		 int c=25;
		 int sum=super.a+b+c;
		System.out.println("addition is "+sum);
		
		
	}
	
	
}
