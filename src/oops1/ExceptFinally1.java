package oops1;

public class ExceptFinally1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int x=1;
			int y=0;
			int z=x/y; //runtime Arithmetic exception
		}
		
		finally {
			System.out.println("cannot divide by zero");
		}
	}

}