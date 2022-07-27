package Generalization;

public class HDFC implements RBI
{

	@Override
	public void intrest() {
		System.out.println("7.5 % intrest");
		
	}

	@Override
	public void SavingAccount() {
		System.out.println("saving account 10000 perday limit");
		
	}

	@Override
	public void currentAccount() {
		System.out.println("current account 100000 perday limit");
		
	}
	
	public void cash_deposit()
	{
		System.out.println("HDFC having cash deposit machine");
	}
	
	
	
	
}
