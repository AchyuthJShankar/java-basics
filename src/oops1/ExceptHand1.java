package oops1;
//Exception Handling - try and catch

public class ExceptHand1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int x=1;
			int y=0;
			int z=x/y; //runtime Arithmetic exception
			System.out.println(z);
		}
		
		catch(ArithmeticException e) {
			System.out.println("cannot divide by zero");
		}

	}

}
