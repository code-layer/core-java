package in.datalayer;

public class NewsFeedException extends Exception {
	private int custMessageCode;
	private String custDetails;

	public NewsFeedException(String message, int custMessageCode, String custDetails) {
		super(message);
		this.custMessageCode = custMessageCode;
		this.custDetails = custDetails;
	}

	public int getCustMessageCode() {
		return custMessageCode;
	}

	public String getCustDetails() {
		return custDetails;
	}
}