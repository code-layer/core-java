
public class DBConnection {
	public void connect() {
		System.out.println("Connected to Database.");
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("Finalize completed");
	}
	
}