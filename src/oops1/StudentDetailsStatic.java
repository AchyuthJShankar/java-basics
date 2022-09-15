package oops1;
//Student details using objects
public class StudentDetailsStatic {
	String name, grp;
	int roll;
	static String college="NIE"; //same value for all

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDetailsStatic std1=new StudentDetailsStatic();
		std1.init("Acchu", 4, "YCC");
		std1.display();
		
		StudentDetailsStatic std2=new StudentDetailsStatic();
		std2.init("Ted", 6, "YT");
		std2.display();
	}
	void init(String name1, int roll1, String grp1) {
		name=name1;
		roll=roll1;
		grp=grp1;
	}
	void display() {
		System.out.println("The Name is "+name);
		System.out.println("Roll number is "+roll);
		System.out.println("Group is "+grp);
		System.out.println("College is "+college);
		System.out.println("------");
	}

}
