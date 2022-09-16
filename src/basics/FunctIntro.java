package basics;

public class FunctIntro {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		FunctIntro obj=new FunctIntro();
		obj.subt(50, 6);
		System.out.println("sum is "+obj.sum(4, 8));
	}
	
	public void subt(int x, int y) 
	{
		//int x=8, y=3;
		int z=x-y;
		System.out.println("Substraction is "+z);	
	}
		
	public int sum(int x, int y) 
	{
		int z=x+y;
		return (z);	
	}


}
