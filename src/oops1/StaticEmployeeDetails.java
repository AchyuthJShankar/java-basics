package oops1;
//Employee Details with static function
public class StaticEmployeeDetails {
	String empName, desig;
	int empID, salary;
	static String employer; //bcz company name is same for all employee


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		compname(); //static function called w/o obj
		StaticEmployeeDetails e1=new StaticEmployeeDetails("Raj", 456325, 767589, "Tester");
		e1.display();
		StaticEmployeeDetails e2=new StaticEmployeeDetails("Kiran", 567743, 1877880, "HR Consultant");
		e2.display();
		StaticEmployeeDetails e3=new StaticEmployeeDetails("Ramesh", 576540, 1243576, "IT consultant");
		e3.display();
		
	}
	StaticEmployeeDetails(String name, int id, int sal, String des) {
		empName=name;
		desig=des;
		empID=id;
		salary=sal;
	}
	void display() {
		System.out.println("Name of the employee is "+empName);
		System.out.print("Employee ID is "+empID);
		System.out.println(" with the salary of "+salary+ " per annum ");
		System.out.print("in the position of "+desig);
		System.out.println(" at the "+employer); //employer is static
		System.out.println();
	}
	static void compname() {
		employer="XYZ Company";
	}
	

}
