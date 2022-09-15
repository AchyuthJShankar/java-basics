package basics;

public class RecFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecFun x=new RecFun();
		int num=5;
		int a= x.fact(num);
		System.out.println("Factorial of "+num+" is "+a);
		

	}
	int fact(int a) {
		if (a==1)
			return 1;
		else
			return(a*(fact(a-1)));  
				
	}

}
