package in.datalayer;

import java.text.DecimalFormat;
/*
 * 
###.###	123.456	123.456
###.#	123.456	123.5
###,###.##	123456.789	123,456.79
000.###	9.95	009.95
##0.###	0.95	0.95
 */
public class NumberDemo {
	public static void main(String[] args) {
		double taxAmt = 45.6782;
		// #, 0
		DecimalFormat df = new DecimalFormat("#00.00");
		String formattedTaxAmt = df.format(taxAmt);
		System.out.println("taAmount after format: " + formattedTaxAmt);
	}
}