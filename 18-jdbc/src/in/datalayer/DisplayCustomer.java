package in.datalayer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DisplayCustomer {
	public static void main(String[] args) throws SQLException {
		Connection con = DBConnection.getDbConnection();
		String sql = "select * from web_customer";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()){
			System.out.println(rs.getInt("cust_id") + "-" + 
						rs.getString("cust_name") + "-" + 
						rs.getDate("join_date") + "-" +
						rs.getDouble("credit_score")) ;
		}
		rs.close();
		con.close();
	}
}