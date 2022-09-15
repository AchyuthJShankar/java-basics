package oops1;
//Static function and static block with 'this' keyword
public class EmployeeThisStatic {
	String empName, desig;
	int empID, salary;
	static String employer; //bcoz company name is same for all employee


	public static void main(String[] args) {
		compname(); //static function called w/o obj
		EmployeeThisStatic e1=new EmployeeThisStatic("Raj", 456325, 767589, "Tester");
		e1.display();
		EmployeeThisStatic e2=new EmployeeThisStatic("Kiran", 567743, 1877880, "HR Consultant");
		e2.display();
		EmployeeThisStatic e3=new EmployeeThisStatic("Ramesh", 576540, 1243576, "IT consultant");
		e3.display();
		
	}
	EmployeeThisStatic(String empName, int empID, int salary, String desig) {
		this.empName=empName;  //this keyword
		this.desig=desig;
		this.empID=empID;
		this.salary=salary;
	}
	void display() {
		System.out.println("Name of the employee is "+empName);
		System.out.print("Employee ID is "+empID);
		System.out.println(" with the salary of "+salary+ " per annum ");
		System.out.print("in the position of "+desig);
		System.out.println(" at the "+employer); //employer is static
		System.out.println();
	}
	//Static function
	static void compname() {
		employer="XYZ Company";
	}
	//Static block will have top priority, will execute first than main
	static {
		System.out.println("Static Block is first");
		System.out.println("------");
	}

}
