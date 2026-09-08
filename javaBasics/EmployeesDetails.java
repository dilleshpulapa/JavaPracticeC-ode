package javaBasics;

public class EmployeesDetails {
	String employeeName;
	int employeeId;
	String designation;
	String department;
	double salary;
	String remoteLocation;
	
	static String companyName="SunTechSolutions";
	static String companyLocation="HI-TECH CITY";
static {
	System.out.println("WELCOME TO SUN TECH SOLUTION! EMPLOYEES HRMS PORTAL");
}
void employeeDetails() {
	System.out.println("CompanyName          :"+companyName);
	System.out.println("CompanyName          :"+companyLocation);
	System.out.println("Name of the Employee :"+employeeName);
	System.out.println("The Employee Id      :"+employeeId);
	System.out.println("designation          :"+designation);
	System.out.println("Department was       :"+department);
	System.out.println("Salary               :"+salary);
	System.out.println("RemoteLocation       :"+remoteLocation);
}
void promoteEmployee() {
	designation="Software Enginner";
	System.out.println("Promote Designation  :"+designation);
}
void upadateSalary() {
	salary=salary+5000;
	System.out.println("Upadated Salary      :"+salary);

}
void employeeLocation() {
	remoteLocation="Gachibowli";
	System.out.println("UPDATED Remote Location :"+remoteLocation);
}
	public static void main(String[] args) {
		EmployeesDetails E=new EmployeesDetails(); 
		
		System.out.println("*****--Empoyee 1 Details--*****");
		
		E.employeeName="Dillesh";
		E.employeeId=1402;
		E.designation="Java Developer";
		E.department="IT-BANKING";
		E.salary=60000.00;
		E.remoteLocation="Hyderabad";
		E.employeeDetails();
		E.promoteEmployee();
		E.upadateSalary();
		E.employeeLocation();

		System.out.println("*****--Empoyee 2 Details--*****");

		E.employeeName="NaveeenKumar";
		E.employeeId=1002;
		E.designation="Frontend Developer";
		E.department="Web Application";
		E.salary=40000.00;
		E.remoteLocation="Secundrabad";
		E.employeeDetails();
		E.promoteEmployee();
		E.upadateSalary();
		E.employeeLocation();
		
	}

}
