package oops1;
//using constructor
public class StudentWithConstructor {
	String name, grp;
	int roll;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentWithConstructor std1=new StudentWithConstructor("Acchu", 4, "YCC");
		std1.display();
		
		StudentWithConstructor std2=new StudentWithConstructor("Ted", 6, "YT");
		std2.display();
	}
	//Constructor
	StudentWithConstructor(String name1, int roll1, String grp1) {
		name=name1;
		roll=roll1;
		grp=grp1;
	}
	void display() {
		System.out.println("The Name is "+name);
		System.out.println("Roll number is "+roll);
		System.out.println("Group is "+grp);
	}

}
