package castingstudy;

public class upcasting {

	public static void main(String[] args) {

		// converting one type of class into another type is called non primitive casting
		// assigning sub class properties into super class is call up casting , before 
		// performing up casting first we need to perform inheritance operation
		father f = new father();
		son s = new son();
		f.house();
		f.money();
		s.money();
		s.house();
		s.degree();
		
		father f1 = new son();
		f1.money();
		f1.house();

	}

}
