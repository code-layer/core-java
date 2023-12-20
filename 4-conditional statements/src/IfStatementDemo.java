
public class IfStatementDemo {
	public static void main(String[] args) {
		double balance = 5000.00, minBalance = 7500.00, monthCharges = 0.0;
		if( balance < minBalance ){
			monthCharges = 125.00;
		}else {
			monthCharges = 0.00;
		}
		System.out.println(" Your monthly charges for balance maintenance: " + monthCharges);
	}

}