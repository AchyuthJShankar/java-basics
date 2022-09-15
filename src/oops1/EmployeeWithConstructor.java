package oops1;

public class EmployeeWithConstructor {
	String empName, desig;
	int empID, salary;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeWithConstructor e1=new EmployeeWithConstructor("Raj", 456325, 767589, "Tester");
		e1.display();
		EmployeeWithConstructor e2=new EmployeeWithConstructor("Kiran", 567743, 1877880, "HR Consultant");
		e2.display();
		EmployeeWithConstructor e3=new EmployeeWithConstructor("Ramesh", 576540, 1243576, "IT consultant");
		e3.display();
		
	}
	EmployeeWithConstructor(String name, int id, int sal, String des) {
		empName=name;
		desig=des;
		empID=id;
		salary=sal;
	}
	void display() {
		System.out.println("Name of the employee is "+empName);
		System.out.print("Employee ID is "+empID);
		System.out.println(" with the salary of "+salary+ " per annum ");
		System.out.println("in the position of "+desig);
		System.out.println();
	}
	

}
