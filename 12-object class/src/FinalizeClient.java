
public class FinalizeClient {
	public static void main(String[] args) {
		DBConnection dbConnection = new DBConnection();
		dbConnection.connect();
		dbConnection = null;

		// initiate gc for testing purpose
		// gc calls all finalize objects
		System.gc();
	}

}