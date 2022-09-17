package oops1;

class C1{
	void m1() throws ArithmeticException
	{
		System.out.println("throws");
	}
}

public class ExceptThrows2 extends C1{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptThrows2 obj=new ExceptThrows2();
		try {
			obj.m1();
		}
		catch(ArithmeticException e) {
			System.out.println("throws catch");
		}
	}

}
