package testing;

import access_specifer.variables;

public class variable_velocity {

	public static void main(String[] args) {
		
		variables v= new variables(); // object create for non static global variable from another package
		
		System.out.println(v.d); // call non static global variable from another package

	}

}
