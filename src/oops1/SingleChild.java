package oops1;
//SINGLE INHERITANCE

class Parent{ //Parent or Super class
	void m1() {
		System.out.println("SINGLE LEVEL INHERTITANCE");
		System.out.println("Parent");
	}
}

//Child or sub or derived class
public class SingleChild extends Parent { 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleChild obj = new SingleChild();
		obj.m1();
		obj.m2();
	}
	void m2() {
		System.out.println("Child");
	}

}
