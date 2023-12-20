
public class IfWithMultipleConditions {
	public static void main(String[] args) {
		double invoiceDueAmt = 1200.00;
		int remainderCount = 3;
		
		if( invoiceDueAmt > 0.00 && remainderCount < 3  ){
			System.out.println("Invoice due remainder. Pay early to continue our services.");
		} else if (invoiceDueAmt > 0.00 && remainderCount >= 3  ){
			System.out.println("Invoice due remainder. Account is closed temporaryly.");
		}
	}

}