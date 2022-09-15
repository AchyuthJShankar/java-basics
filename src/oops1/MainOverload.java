package oops1;
//main overloading
public class MainOverload {
	public static void main(String[] args) { //It is called by JVM
        System.out.println("main1");
        main(4); // other main is called 
        main();
    }

    public static void main(int a) {
        System.out.println(a);
    }
    public static void main() {
        System.out.println("no param");
    }
}
