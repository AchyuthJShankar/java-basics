package oops1;

public class AddOverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddOverload obj=new AddOverload();
		obj.add(19, 16);
		obj.add(9.8, 1.6);
		obj.add(3, 5, 5.9f);

	}
	void add(int x, int y) {
		System.out.println("Addition of two numbers are "+(x+y));
	}
	void add(double x, double y) {
		System.out.println("Addition of two numbers are "+(x+y));
	}
	void add(int x, int y, float z) {
		System.out.println("Addition of three numbers are "+(x+y+z));
	}

}
