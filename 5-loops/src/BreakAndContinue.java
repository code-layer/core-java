/**
 *
 * @author Vasantha K
 * sum of first 10 nos using while loop
 *
 */
public class BreakAndContinue {
	public static void main(String[] args) {
		int sum = 0;
		int count = 0;

		while ( true ) {		// always true condition
			sum = sum + count;
			count ++;
			if( count <= 10 )
				continue;
			else
				break;	//stop or break loop
		}
		System.out.println("Sum of first 10 nos is : " + sum);
	}

}