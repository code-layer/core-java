/**
 * 
 * @author Vasantha K
 * 
 * Assign one data type variable value to another data type variable
 * Follow the rules of explicit cast
 * 
 */
public class ExplicitCast {
	public static void main(String[] args) {
		
		int counter = 123;
		byte count = (byte) counter;
		System.out.println(" count: " + count);
		
		counter = 2000;
		count = (byte) counter;
		System.out.println(" count: " + count);
		
	}
	
}