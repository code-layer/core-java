package in.datalayer;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

public class DatabaseInformation {
	public static void main(String[] args) throws SQLException {
		Connection con = DBConnection.getDbConnection();

		DatabaseMetaData dbMetaData = con.getMetaData();
		System.out.println("Database Version: " + dbMetaData.getDatabaseProductVersion());
		System.out.println("Driver Name: " + dbMetaData.getDriverName());
		System.out.println("Driver Version: " + dbMetaData.getDriverVersion());
		System.out.println("URL: " + dbMetaData.getURL());
		System.out.println("User Name: " + dbMetaData.getUserName());
    }
}