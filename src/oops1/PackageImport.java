package oops1;
//IMPORTING PACKAGE
//import basics.*; //imports all classes of basics pack
import basics.FunctIntro; //imports FunctIntro of basicIntro
public class PackageImport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctIntro obj=new FunctIntro();
		System.out.println(obj.sum(12,5)); //sum is public func in imported class

	}

}
