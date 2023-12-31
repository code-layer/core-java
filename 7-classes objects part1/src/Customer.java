
public class Customer {
	private int custId;
	private String custName,mobileNo;
	
	public void register(int id, String name, String mobNo) {
		custId = id;
		custName = name;
		mobileNo = mobNo;
	}
	
	public void viewCustomerDetails() {
		System.out.println(" Customer Id: " + custId);
		System.out.println(" Customer Name: " + custName);
		System.out.println(" Mobile No: " + mobileNo);
	}
}