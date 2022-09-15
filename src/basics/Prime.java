package basics;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=6, i, x=0;
		if (a<2)
			System.out.println(a+" is not a Prime number");
		else {
			for(i=2; i<=(a/2);i++) {
				if(a%i==0) {
					System.out.println(a+" is not a Prime number");
					x=1;
					break;
				}
			}
			if (x==0)
				System.out.println(a+" is a Prime Number");
		}

	}

}
