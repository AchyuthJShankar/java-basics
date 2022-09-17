package oops1;

public class CatchMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int z[]=new int[6];
		try {
			int x=1;
			int y=0;
			z[6]=x/y; //runtime Arithmetic exception
		}
		
		// only it will execute 
		catch(ArithmeticException e) { 
			System.out.println("cannot divide by zero");
		}
		
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array is out of bound");
		}
		
	}

}
