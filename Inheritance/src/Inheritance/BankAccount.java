package Inheritance;

public class BankAccount {
String name;
String ifsc;
String bankName;
long accNo;
int pin;
String branch;
long phNo;


public BankAccount() {
	
}

public BankAccount(String name ,String ifsc ,String bankName,long accNo,
		int pin,String branch,long phNo) {
	this.name=name;
	this.ifsc=ifsc;
	this.bankName=bankName;
	this.accNo=accNo;
	this.pin=pin;
	this.branch=branch;
	this.phNo=phNo;
	
}

public void displayBankDetails() {
	System.out.println(name);
	System.out.println(ifsc);
	System.out.println(bankName);
	System.out.println(accNo);
	System.out.println(pin);
	System.out.println(branch);
	System.out.println(phNo);
}


}
