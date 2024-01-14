package in.datalayer;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class AddBulkCustomers {
	public static void main(String[] args) throws SQLException {
		Connection con = DBConnection.getDbConnection();
		try {
			con.setAutoCommit(false);
			String row1 = "insert into web_customer ( cust_id, cust_name ,join_date,credit_score) values (201,'Ravi V','2018-02-10',150.00)";
			String row2 = "insert into web_customer ( cust_id, cust_name ,join_date,credit_score) values (202,'P Ramu','2018-02-12',235.00)";
			String row3 = "insert into web_customer ( cust_id, cust_name ,join_date,credit_score) values (203,'Giri','2018-02-14',15.67)";
			Statement stmt = con.createStatement();
			stmt.addBatch(row1);
			stmt.addBatch(row2);
			stmt.addBatch(row3);

			int[] batchStatus = stmt.executeBatch();
			int rowCount= 0;
			for(int status :batchStatus){
				System.out.println("Row " + rowCount + " Status: " + status);
				rowCount ++ ;
			}
			con.commit();
		} catch (SQLException e) {
			con.rollback();
			e.printStackTrace();
		}
		System.out.println(" Row Added ");
	}
}