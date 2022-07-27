package testing;

import access_specifer.Private;

public class velocity extends Private {

	public static void main(String[] args) 
	{

		Private p = new Private();// create object for another class
		p.test4();// we can call only public method in another package
		
		
		velocity v =new velocity();// create object of the child class
		v.test3();// calling protected  method from another package
		v.test4();// calling public method from another package
		
		
		
	}

}
