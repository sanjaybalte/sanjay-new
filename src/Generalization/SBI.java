package Generalization;

public class SBI implements RBI
{

	@Override
	public void intrest() {
		System.out.println("5% intrest");
		
	}

	@Override
	public void SavingAccount() {
		System.out.println("20000 rs per day limit");
		
	}

	@Override
	public void currentAccount() {
		System.out.println("100000 pler day limit");
		
	}
	void UNO_app()
	{
		System.out.println("UNO app");
	}

}
