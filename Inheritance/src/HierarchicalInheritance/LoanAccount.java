package HierarchicalInheritance;

public class LoanAccount extends BankAccount {
double loan_ammount;
double ROI;
String Type_Of_Loan;

public LoanAccount() {
	
}

public LoanAccount(String name, String ifsc, String bankName, long accNo,
		int pin, String branch, long phNo,double loan_ammount,
		double ROI,String Type_Of_Loan ) {
	
	this.name=name;
	this.ifsc=ifsc;
	this.bankName=bankName;
	this.accNo=accNo;
	this.pin=pin;
	this.branch=branch;
	this.phNo=phNo;
	
	this.loan_ammount=loan_ammount;
	this.ROI=ROI;
	this.Type_Of_Loan=Type_Of_Loan;
	
}

public void displayLoanAccount() {

	displayBankDetails();
	System.out.println(loan_ammount);
	System.out.println(ROI);
	System.out.println(Type_Of_Loan);
}



}
