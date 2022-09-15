package basics;

public class BiggestNo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=14;
		int b=100;
		int c=13;
		if(a>=b){
			if(a>=c) 
				System.out.println("Biggest number is "+a);
			else
				System.out.println("Biggest number is "+c);
		}
		
		else{
			if(b>=c)
				System.out.println("Biggest number is "+b);
			else 
				System.out.println("Biggest number is "+c);
		}
	}
}
