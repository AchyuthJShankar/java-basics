package oops1;
//Private Constructor
class B{
	private B() { //Private cons
		System.out.println("Private cons");
	}
	void xyz() {
		System.out.println("public");
	}
	
}

public class PrivateConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//object for class B can't be created 
		//cz it has private constructor
		//B obj=new B();
		

	}

}
