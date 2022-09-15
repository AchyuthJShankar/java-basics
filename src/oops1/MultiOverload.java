package oops1;

public class MultiOverload {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiOverload obj=new MultiOverload();
		obj.multi(1, 6);
		obj.multi(9, 1.6);
		obj.multi(31, 5, 5.9f);

	}
	void multi(int x, int y) {
		System.out.println("multiplication of two numbers are "+(x*y));
	}
	void multi(int x, double y) {
		System.out.println("multiplication of two numbers are "+(x*y));
	}
	void multi(int x, int y, float z) {
		System.out.println("multiplication of three numbers are "+(x*y*z));
	}

}