package basics;

public class ArrayIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int num[]=new int[50];
		//num[0]=4;
		
		int a[]= {4,5,12,0,11};
		/*for (int i=4; i>=0; i--)
			System.out.println(a[i]);
		*/
		
		for (int x=0; x<a.length; x++) {
			for (int y=x+1; y<a.length; y++) {
				int temp=0;
				if(a[x]>a[y]) {
					temp=a[x];
					a[x]=a[y];
					a[y]=temp;
				}
			}
			//System.out.println(a[x]);
		}
		for (int i=0; i<a.length; i++)
			System.out.println(a[i]);

	}

}
