package access_specifer;

public class sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Private p = new Private();// create object of another class
		p.test2();
		p.test3();
		p.test4();
		// p.test1();   we cant call private method in another class
		
		
		
	}

}
