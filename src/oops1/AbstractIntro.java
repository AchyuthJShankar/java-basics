package oops1;
//Abstract method and abstract class

abstract class AbC{ //Abstract class
	abstract void fun1(); //Abstract method
	void fun2() { //non abstract method
		System.out.println("non abstract method inside ab class");
	}
}

public class AbstractIntro extends AbC {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractIntro obj=new AbstractIntro();
		obj.fun1();
		obj.fun2();
	
	}
	//Abstract method defination inside sub class
	void fun1() { 
		System.out.println("abstract method");
	}
}
