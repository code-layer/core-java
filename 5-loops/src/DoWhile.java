
public class DoWhile {
	public static void main(String[] args) {
		int sum = 0;
		int count = 0;
		
		do {
			sum = sum + count;
			count ++;
		} while ( count <= 10) ;
		
		System.out.println("Sum of first 10 nos is : " + sum);

	}

}