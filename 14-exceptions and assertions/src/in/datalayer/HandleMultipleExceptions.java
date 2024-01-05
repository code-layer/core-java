package in.datalayer;

public class HandleMultipleExceptions {
	public static void main(String[] args) {
		// String[] cityNames  = null;
		String[] cityNames  = { "Delhi", "Bombay" };
		processCityNames(cityNames);
	}

	private static void processCityNames(String[] cityNames) {
		try {
			System.out.println("City Name:" + cityNames[5]);
			
		}catch(ArrayIndexOutOfBoundsException aroobe) {
			System.out.println("Array Index value is not available");
			aroobe.printStackTrace();

		}catch(NullPointerException npe){
			System.out.println("cityNames is EMPTY");
			npe.printStackTrace();
		}
	}
}