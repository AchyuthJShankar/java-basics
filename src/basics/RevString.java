package basics;

public class RevString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="name", b="";
		int len=a.length();
		for(int i=len-1; i>=0; i--) {
			b+=a.charAt(i);
		}
		System.out.println("Reverse of "+a+" is "+b);
	}
}
