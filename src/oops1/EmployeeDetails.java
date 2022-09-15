package oops1;
//Employee Details using objects
public class EmployeeDetails {
	String empName, desig;
	int empID, salary;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDetails e1=new EmployeeDetails();
		e1.init("Raj", 456325, 767589, "Tester");
		e1.display();
		EmployeeDetails e2=new EmployeeDetails();
		e2.init("Kiran", 567743, 1877880, "HR Consultant");
		e2.display();
		EmployeeDetails e3=new EmployeeDetails();
		e3.init("Ramesh", 576540, 1243576, "IT consultant");
		e3.display();
		
	}
	void init(String name, int id, int sal, String des) {
		empName=name;
		desig=des;
		empID=id;
		salary=sal;
	}
	void display() {
		System.out.println("Name of the employee is "+empName);
		System.out.print("Employee ID is "+empID);
		System.out.print(" with the salary of "+salary+ " per annum ");
		System.out.println("in the position of "+desig);
	}
	

}
