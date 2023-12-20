
public class StatementDemo {
	public static void main(String[] args) {
		int bankBalance = 2000;
		bankBalance = bankBalance + 5000;		// deposit 5000
		bankBalance = bankBalance - 1250;	// withdraw 1250
		
		System.out.println(" Present bankBalance : " + bankBalance);
		
		// add monthly interest earnings
		// rate of .0025 per month
		double monthInterest = bankBalance * 0.0025;
		
		double totalBalance = bankBalance + monthInterest;
		System.out.println(" totalBalance: " + totalBalance);
	}

}