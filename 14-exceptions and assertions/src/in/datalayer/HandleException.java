package in.datalayer;

public class HandleException {
	public static void main(String[] args) {
		String compName  = null;
		// processCompData(compName);
		processCompDataWithExceptions(compName);
	}

	private static void processCompDataWithExceptions(String compName) {
		try {
			System.out.println("compName length: " + compName.length());
		}catch(NullPointerException npe){
			System.out.println("Exception occured");
			System.out.println("compName is NULL");
		}
	}

	private static void processCompData(String compName) {
		System.out.println("compName length: " + compName.length());
	}

}