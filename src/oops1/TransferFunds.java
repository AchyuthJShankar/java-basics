package oops1;
//MULTI LEVEL INHERITANCE
class Login1{
	void info() {
		System.out.println("ID: ABCD, pwd: qwer@123");
	}
}

class AddBen1 extends Login1{
	void rec() {
		System.out.println("Recieved by benif");
	}
}

public class TransferFunds extends AddBen1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TransferFunds obj= new TransferFunds();
		obj.info();
		obj.rec();
		obj.tran();

	}
	void tran() {
		System.out.println("Funds Transfered");
	}

}
