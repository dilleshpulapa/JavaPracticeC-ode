package javaBasics;

public class EmpLogin {
	String empName;
	double salary;
	boolean doorPower;
	boolean blocked;

	EmpLogin(String empName, double salary, boolean doorPower, boolean blocked) {
		System.out.println("********************");
		this.empName = empName;
		this.salary = salary;
		this.doorPower = doorPower;
		this.blocked =blocked;
	}

	void checkAccess() {
		boolean access = doorPower && !blocked;

		System.out.println("Employee Name  :" + empName);
		System.out.println("Salary         :" + salary);
		System.out.println("Door power is  :" + doorPower);
		System.out.println("Blocked        :" + blocked);
		System.out.println("Current Access :" + access);
	}

	public static void main(String[] args) {
		EmpLogin EL = new EmpLogin("Dillesh", 45000,true , false);
		EL.checkAccess();
	}

}
