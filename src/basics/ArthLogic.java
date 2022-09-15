package basics;

public class ArthLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=4, b=5, c=7, d=9;
		ArthLogic obj=new ArthLogic();
		System.out.println("sum of "+a+" and "+b+ " is "+(obj.add(a, b)));
		System.out.println("Substraction of "+c+" and "+d+ " is "+(obj.sub(c, d)));
		obj.mult(5, 7);
		obj.div(10, 3);
	}
	int add(int x, int y) {
		int z=x+y;
		return (z);
	}
	int sub(int x, int y) {
		int z=x-y;
		return (z);
	}
	void mult(int x, int y) {
		int z=x*y;
		System.out.println("Product of "+x+" and "+y+ " is "+z);
	}
	void div(int x, int y) {
		int z=x/y;
		System.out.println("Quotient of "+x+" and "+y+ " is "+z);
	}

}
