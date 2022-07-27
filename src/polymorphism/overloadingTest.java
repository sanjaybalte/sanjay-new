package polymorphism;



public class overloadingTest extends overloading_study {

	public static void main(String[] args) {
		
		overloadingTest o = new overloadingTest();
		o.demo();
		o.demo(0, 0);
		o.demo(0, 0, 0);
		//demo();  // we can call method directly
		
	}

}
