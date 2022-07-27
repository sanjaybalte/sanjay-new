package inheritence_;

public class single_level_in {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// to call mother non ststic property we create mother object
		
		mother m= new mother();
		
		// to call child non ststic property we create child  object
		
		child c = new child();
		
		m.nature();          // calling mother property
		mother.care();       // callind mother property
		
		c.mobile();     // calling child property
		child.laptop();  // calling child property
		
		c.nature();
		child.care();
		child.laptop();
		
		
		
	}

}
