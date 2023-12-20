
public class WhileLoop {
	public static void main(String[] args) {
		int sum = 0;
		int count = 0;
		
		while ( count <= 10) {
			sum = sum + count;
			count ++;
		}
		System.out.println("Sum of first 10 nos is : " + sum);
	}

}