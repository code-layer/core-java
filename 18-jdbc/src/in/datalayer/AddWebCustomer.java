package in.datalayer;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class AddWebCustomer {
	public static void main(String[] args) throws SQLException  {
		Connection con = DBConnection.getDbConnection();
		try {
			con.setAutoCommit(false);
			String sql = "insert into web_customer ( cust_id, cust_name ,join_date,credit_score) values (103,'Vasantha K','2018-11-20',450.00)";
			Statement stmt = con.createStatement();
			stmt.execute(sql);
			con.commit();
		} catch (SQLException e) {
			con.rollback();
			e.printStackTrace();
		}
		System.out.println(" Row Added ");
	}
}