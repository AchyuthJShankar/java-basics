package oops1;
//SingleLevelInheritance
class Login{
	void info() {
		System.out.println("ID: ABCD, pwd: qwer@123");
	}
}

public class AddBen extends Login{
	public static void main(String[] args) {
		AddBen obj=new AddBen();
		obj.info();
		obj.rec();


	}
	void rec() {
		System.out.println("Recieved by benif");
	}

}
