package HierarchicalInheritance;

public class SavingAccount extends BankAccount {
	double balance;
	double intrest;
	String type;
	
	public SavingAccount() {
		
	}
	
	public SavingAccount(String name ,String ifsc ,String bankName,long accNo,
			int pin,String branch,long phNo,double balance,double intrest,String type) {
		this.name=name;
		this.ifsc=ifsc;
		this.bankName=bankName;
		this.accNo=accNo;
		this.pin=pin;
		this.branch=branch;
		this.phNo=phNo;
		
		
		this.balance=balance;
		this.intrest=intrest;
		this.type=type;
		
	}
	
	public void displaySavingDetails() {
		displayBankDetails();
		System.out.println(balance);
		System.out.println(intrest);
		System.out.println(type);
		
	}
	

}

