package oops1;
//Method overriding
class Animal{
	void fun() {
		System.out.println("Animal");
	}
}

public class MethodOverrideIntro extends Animal{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//OPTION 1
		Animal a=new Animal();
		a.fun(); // calling super class function from it's object
		
		MethodOverrideIntro obj = new MethodOverrideIntro();
		obj.fun();

	}
	void fun() {
		//OPTION 2
		super.fun(); //calls superclass' function from 'super' keyword
		System.out.println("Dog");
	}

}
