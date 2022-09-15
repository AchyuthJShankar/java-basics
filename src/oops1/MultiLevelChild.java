package oops1;
//MULTIILEVEL INHERTANCE

class GrandParent{
	void m1() {
		System.out.println("MULTI LEVEL INHERTITANCE");
		System.out.println("Grand Parent");
	}
}

class Parent1 extends GrandParent{
	void m2() {
		System.out.println("Parent");
	}
}

public class MultiLevelChild extends Parent1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiLevelChild obj = new MultiLevelChild();
		obj.m1();
		obj.m2();
		obj.m3();
	}
	void m3() {
		System.out.println("Child");
	}

}
