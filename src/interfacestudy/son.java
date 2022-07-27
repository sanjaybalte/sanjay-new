package interfacestudy;

public class son implements father, mother  {

	public static void main(String[] args)
	{
		son s = new son();// creat object of son class
		s.care();
		s.love();
		s.nature();
		s.recipee();
		s.money();

		
		

	}

	@Override
	public void recipee()
	{
		System.out.println("mother recipee complete in sons class");
		
	}

	@Override
	public void care() {
		System.out.println("mother care complete in sons class");
		
	}

	@Override
	public void love()
	{
		System.out.println("father love complete in sons class");
		
	}

	@Override
	public void nature() {
		System.out.println("father nature complete in sons class");
		
	}

	@Override
	public void money() 
	{
		father.super. money();// super keywords is used to calling issues
		mother.super. money();//multiple interface
		
		
	}

}
