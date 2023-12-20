
public class SwitchStringDemo {
	public static void main(String[] args) {
		// possible values are ACT, WIP, CLS
		String status = "ACT";
		switch( status ){
			case "ACT":
				System.out.println("Status is ACTIVE ");
				break;
			case "WIP":
				System.out.println("Status is WORK_IN_PROGRESS ");
				break;		
			case "CLS":
				System.out.println("Status is CLOSED ");
				break;		
			default:
				System.out.println("Invalid Status");
				break;
		}
		System.out.println("End of program");
	}

}