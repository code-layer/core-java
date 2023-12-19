/**
 * 
 * @author Vasantha K
 * 
 * Assign one data type variable value to another data type variable
 * Follow the rules of implicit cast
 * 
 */
public class ImplicitCast {
	public static void main(String[] args) {
		
		byte count = 127;
		int counter = count;
		System.out.println(" counter value: " + counter);
		
		char flag='A';
		int intFlag = flag;
		System.out.println(" intFlag value: " + intFlag);

		int salary = 12000;
		int allowances = 450;
		double totalSalary = salary + allowances;
		
		System.out.println(" totalSalary : " + totalSalary);

	}

}