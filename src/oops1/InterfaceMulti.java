package oops1;
//Implement multiple inheritance with interface
interface if1{
	void fun1();
}

interface if2 {
	void fun2();
}

public class InterfaceMulti implements if1, if2{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceMulti obj= new InterfaceMulti();
		obj.fun1();
		obj.fun2();
	}
	public void fun1() {
		System.out.println("Fun 1");
	}
	public void fun2() {
		System.out.println("Fun 2");
	}
}
