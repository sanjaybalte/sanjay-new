package interfacestudy;

public interface mother
{

	void recipee();
	void care();
	default void money()
	{
		System.out.println("mothers money");
	}
	
	
	
	
}
