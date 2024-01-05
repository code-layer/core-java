package in.datalayer;

public class AssertionDemo {
	public static void main(String[] args) {
		String compName = "ABC Cons";
		verifyCompName(compName);
	}

	private static void verifyCompName(String compName) {
		int length = compName.length();
		System.out.println(length);
		
		// check for true condition, continue
		assert length<15 : "Invalid Company Name";
		
		//perform all other validations on compName
		System.out.println(" *** Company name verified **** ");
	}

}