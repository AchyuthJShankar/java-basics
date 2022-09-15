package oops1;
//Checking Default value
public class DefaultConst {
	boolean	bool;
	byte by;
	short sh;
	int	in;
	long l;
	char ch;
	float f;
	double d;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultConst a=new DefaultConst();
		System.out.println("Default value for int is "+a.in); //0
		System.out.println("Default value for boolean is "+a.bool); //false
		System.out.println("Default value for byte is "+a.by); //0
		System.out.println("Default value for short is "+a.sh);//0
		System.out.println("Default value for long is "+a.l);//0L
		System.out.println("Default value for char is "+a.ch);//u0000
		System.out.println("Default value for float is "+a.f);//0.0f
		System.out.println("Default value for double is "+a.d);//0.0d
		

	}

}
