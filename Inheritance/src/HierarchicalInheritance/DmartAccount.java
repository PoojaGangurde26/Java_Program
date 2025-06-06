package HierarchicalInheritance;

public class DmartAccount extends  BankAccount {
	
	double dmart_balance;
	int dmart_ID;
	
	
	public DmartAccount() {
		
	}


	public DmartAccount(String name, String ifsc, String bankName, long accNo,
			int pin, String branch, long phNo,double dmart_balance,int dmart_ID ) {
		
		
		this.name=name;
		this.ifsc=ifsc;
		this.bankName=bankName;
		this.accNo=accNo;
		this.pin=pin;
		this.branch=branch;
		this.phNo=phNo;
		
		this.dmart_balance=dmart_balance;
		this.dmart_ID=dmart_ID;
	
	}
	
	public void displayDmartAccount() {
		
		displayBankDetails();
		
		System.out.println(dmart_balance);
		System.out.println(dmart_ID);
	}
	
	

}
