package oops1;
//final
class Fin{
	final void ani() { //cannot be overloaded
		System.out.println("ABC");
	}
}
final class Final1{ //cannot be extended
	void ani1() { 
		System.out.println("XYZ");
	}
	
}
public class FinalExample extends Fin{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//final variable
		final int x = 99; // cannot change the value in other place
		System.out.println("Value of x is "+x);
	}

}
