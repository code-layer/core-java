
public class ArrayResize {
	public static void main(String[] args) {
		int[ ] days = { 1, 2, 3 };
		System.out.println(" ***  days *** " );
		for(int day : days ){
			System.out.println(" day no: " + day);
		}

		days = new int[ ] { 5,6,7};
		System.out.println(" ***  resized days *** " );
		for(int day : days ){
			System.out.println(" day no: " + day);
		}

		// resize array
		int[ ] newDays = new int[6];
		newDays[0] = days[0];
		newDays[1] = days[1];
		newDays[2] = days[2];

		newDays[3] = 8;
		newDays[4] = 9;
		newDays[5] = 10;
		System.out.println(" ***  resized newDays *** " );
		for(int day : newDays ){
			System.out.println(" day no: " + day);
		}

	}

}