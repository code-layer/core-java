
public class AccessArrayElements {
	public static void main(String[] args) {
		String[] countries = {
			"India",
			"United States",
			"Singapore",
			"Malaysia"
		};

		// traditional for loop
		System.out.println(" *** using traditional for loop *** ");
		for( int index=0; index<countries.length ; index++){
			System.out.println( countries[index]);
		}

		// for each loop, java syntax
		System.out.println(" *** using for each loop *** ");
		for(String country : countries)
			System.out.println(country);
	}

}