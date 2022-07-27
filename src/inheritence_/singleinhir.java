package inheritence_;

public class singleinhir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// to call father non static property we have to create object
		
		father f = new father();
		
		// to call son non static property we have to create son object
		son s = new son();
		
		f.land();      // calling father property
		father.house();// calling father property
		
		s.bike();                  // calling son property
		son.swimming_suit();        // calling son property
		
		
		s.land();                   // calling father property through son object
		son.house();                // calling father property through son class
		
		s.house();                  // calling father property through son object
		
		
		
		
		
		
		
		
		
	}

}
