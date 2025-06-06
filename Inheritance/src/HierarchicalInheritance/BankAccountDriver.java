package HierarchicalInheritance;

public class BankAccountDriver {
	public static void main(String arg[]) {
		
		
		SavingAccount s1=new SavingAccount("Pooja", "ICIC", "ICIC", 
				9099898765l, 1234, "deccan", 9022192133l, 90000, 1000, "Saving account");
		
		s1.displayBankDetails();
		System.out.println("-----------------------------");
		
		s1.displaySavingDetails();
		
		
		System.out.println("-----------------------------");
		
		
		LoanAccount l1=new LoanAccount("Pooja", "ICIC", "ICIC", 
				9099898765l, 1234, "deccan", 9022192133l, 12300.0, 3.0,"Home Loan");
		
		l1.displayBankDetails();
		
		System.out.println("-----------------------------");
		
		l1.displayLoanAccount();
		
		System.out.println("-----------------------------");
		
		
		DmartAccount d1=new DmartAccount("Pooja", "ICIC", "ICIC", 
				9099898765l, 1234, "deccan", 9022192133l,8765,12);	
		
		d1.displayBankDetails();
		System.out.println("-----------------------------");
		d1.displayDmartAccount();
		System.out.println("-----------------------------");
	
	}

}
