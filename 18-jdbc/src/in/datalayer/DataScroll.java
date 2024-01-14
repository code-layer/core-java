package in.datalayer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataScroll {
	public static void main(String[] args) throws SQLException {
		Connection con = DBConnection.getDbConnection();
		String sql = "select * from web_customer";
		Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		ResultSet rs = stmt.executeQuery(sql);
		System.out.println("Default Features");
		while(rs.next()){
			System.out.println("Row Customer Name: " + rs.getString("cust_name"));
		}

		System.out.println(" **** Scroll Features  **** ");
		// scrolling
		if(rs.absolute(2)){
			System.out.println("Row2 Customer Name: " + rs.getString("cust_name"));
		}
		rs.previous();
		System.out.println("Row1 Customer Name: " + rs.getString("cust_name"));
		
		rs.next();
		rs.next();
		int currentRowNo = rs.getRow();
		System.out.println("Result Set Current Row No :" + currentRowNo);
		
		rs.close();
		con.close();
	}
}