
public class IncrementDecrementOperator {
	public static void main(String[] args) {
		int counter = 10;
		
		// post increment
		System.out.println(" Counter: " + counter++);

		//pre increment
		System.out.println(" Counter: " + ++counter);
		
		int tmpCounter = counter++;
		System.out.println("tmpCounter: " +  tmpCounter);
		System.out.println("counter: " + counter);
		
		//similarly pre and post decrement ops
	}

}