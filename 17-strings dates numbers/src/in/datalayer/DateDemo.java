package in.datalayer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
	public static void main(String[] args) throws ParseException {
		Date currDate = new Date();
		System.out.println("Current date and time:" + currDate);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println( " current date in dd/mm/yyyy format: "
				 + sdf.format(currDate));

		String testDateStr = "2016-02-27";
		sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date testDate = sdf.parse(testDateStr);
		System.out.println("testDate value :" + testDate);
	}
}