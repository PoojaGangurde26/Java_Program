package Inheritance;

public class BankAccountDriver {
	public static void main(String []arg) {
		SavingAccount s1=new SavingAccount("Pooja", "ICIC", "ICIC", 
				9099898765l, 1234, "deccan", 9022192133l, 90000, 1000, "Saving account");
				s1.displayBankDetails();
				System.out.println("____________________________________");
				s1.displaySavingDetails();
	}

}
