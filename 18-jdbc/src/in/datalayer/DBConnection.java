package in.datalayer;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	private static String JDBC_DRIVER = "com.mysql.jdbc.Driver",
					DB_URL = "jdbc:mysql://localhost:3306/test",
					USER = "root",
					PASS = "admin123";
	private static Connection conn = null;

	public static Connection getDbConnection() {
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Connected database successfully...");
		} catch (Exception ex) {
			System.out.println("JDBC Conn error : " + ex);
		}
		return conn;
	}
}