package javaBasics;

public class LoanManagement {
String customerName;
double loanAmount;
double interestRate;
int loanTenure=1;
double interestResult;
double totalAmount;
double emi;
double caluculateIntrest(double a,double b,double c) {
	loanAmount=loanAmount;
	interestRate=interestRate;
	interestResult=(loanAmount*interestRate*loanTenure)/100;
	return totalAmount;
}
double caluclateTotalAmount() {
	totalAmount=loanAmount+interestResult;
	return totalAmount;
}
double calculateMonthlyEMI() {
	emi=totalAmount/(loanTenure*12);
	return emi;
}
void displayLoanSummary() {
	System.out.println("Customer Name :"+customerName);
	System.out.println("LoanAmount :"+loanAmount);
	System.out.println("InterestRate :"+interestRate);
	System.out.println("LoanTenure :"+loanTenure);
	System.out.println("the TotalAmount :"+totalAmount);
}
public static void main(String[] args) {
	LoanManagement L=new LoanManagement();
	L.customerName="Asrith";
	L.loanAmount=100000.00;
	L.interestRate=2;
	L.loanTenure=1;
double result=L.caluculateIntrest(100000,2 , 12);
System.out.println(result);
double totalAmountResult=L.caluclateTotalAmount();
System.out.println(totalAmountResult);
double monthlyEmiResult=L.calculateMonthlyEMI();
System.out.println(monthlyEmiResult);
L.displayLoanSummary();
	}

}
