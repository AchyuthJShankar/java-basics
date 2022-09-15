package oops1;

public class SubOverload {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubOverload obj=new SubOverload();
		obj.sub(3, 5);
		obj.sub(9, 1.6);
		obj.sub(3, 5, 15.4f);

	}
	void sub(int x, int y) {
		System.out.println("Substraction of two numbers are "+(x-y));
	}
	void sub(int x, double y) {
		System.out.println("Substraction of two numbers are "+(x-y));
	}
	void sub(int x, int y, float z) {
		System.out.println("Substraction of three numbers are "+(x-y-z));
	}

}
