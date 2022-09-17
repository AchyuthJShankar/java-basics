package oops1;
//GIVES CUSTOM EXCEPTION IN RUNTIME

public class ExceptThrow1 {
	static void vote(int age) {
		if(age<18)
			throw new ArithmeticException ("invalid age");
		else
			System.out.println("Valid age");
	}

	public static void main(String[] args) {

		//gives exception "invalid age" at complier
		vote(16); 
	}

}
