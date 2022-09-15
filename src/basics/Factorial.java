package basics;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=4, fact=1;
		if (num==0)
			System.out.println("Factorial of 0 is 1");
		else {
			while(num>0)
			{
				fact*=num;
				num--;	
			}
			System.out.println("Factorial is " +fact);
		}
	}
}
