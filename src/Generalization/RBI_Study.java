package Generalization;

public class RBI_Study {

	public static void main(String[] args) 
	{
		System.out.println("==========SBI=================");
		SBI s = new SBI();
		s.currentAccount();s.intrest();
		s.SavingAccount();
		s.UNO_app();
		System.out.println("=============BOM===========");
		BOM b = new BOM();
		b.currentAccount();
		b.intrest();
		b.SavingAccount();
		b.mahabank();
		
		System.out.println("======HDFC=======");
		
		HDFC h = new HDFC();
		h.currentAccount();
		h.intrest();
		h.SavingAccount();
		h.cash_deposit();

	}

}
