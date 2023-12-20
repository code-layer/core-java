
public class MultiDimArray {
	public static void main(String[] args) {
		// declare multi dim array
		int seatNo[][] = new int[2][2];

		// init values
		// first row
		seatNo[0][0]=10;
		seatNo[0][1]=12;

		// second row
		seatNo[1][0]=20;
		seatNo[1][1]=45;

		int rows = 2;
		int cols = 2;
		int row,col;

		for(row=0; row < rows; row++) {
			for(col=0; col < cols; col++) {
				System.out.print(  seatNo[row][col] + " ");
			}
			System.out.println();
		}

	}

}