package basics;

public class SwitchCond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day=5;
		switch(day) {
		case 1:
			System.out.println("Day is Monday");
			break;
		case 2:
			System.out.println("Day is Tuesday");
			break;
		case 4:
			System.out.println("Day is Thusrday");
			break;
		case 5:
			System.out.println("Day is Friday");
			break;
		case 6:
			System.out.println("Day is Saturday");
			break;
		case 7:
			System.out.println("Day is Sunday");
			break;
		default:
			System.out.println("Invalid entry");
		}

	}

}
