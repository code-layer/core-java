/**
 *
 * @author Vasantha K
 * sum of first 10 nos using while loop
 *
 */
public class BreakContinueWithLabel {
	public static void main(String[] args) {
		outerLoop:
		while(true) {
			System.out.println(" processing outer loop");

			innerLoop:
			while(true) {
				System.out.println(" processing inner loop");
				break outerLoop;

			} //end of inner loop

		}//end of outer loop
		System.out.println("PROCESSING COMPLETED ");
	}
}