
public class NonShortCircuitOperator {
	public static void main(String[] args) {
		boolean empStatus = true;
		int daysPresent = 28;
		
		System.out.println( empStatus & daysPresent > 25);
		
		daysPresent = 20;
		System.out.println( empStatus & daysPresent > 25);

	}

}