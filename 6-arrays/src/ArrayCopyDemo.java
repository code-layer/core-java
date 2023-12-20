
public class ArrayCopyDemo {
	public static void main(String[] args) {
		String[] asianCountries = {
				"India",
				"Singapore",
				"Malaysia"
			};

		String[] allCountries = new String[10];
		System.arraycopy(asianCountries, 0, allCountries, 0, 3);

		for(String country : allCountries)
			System.out.println(country);

	}

}