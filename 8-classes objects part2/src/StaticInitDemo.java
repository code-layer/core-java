
public class StaticInitDemo {
	private static String comName,comAddress;
	
	static {
		comName = "ABC Technologies Pvt Ltd";
		comAddress = "No:1, MG Road, Bangalore";
	}
	
	public void dispCompanyDetails() {
		System.out.println("Compnay Name: " + comName);
		System.out.println("Compnay Address: " + comAddress);
	}

	public static void main(String[] args) {
		System.out.println(" *** company static details *** ");
		StaticInitDemo sid = new StaticInitDemo();
		sid.dispCompanyDetails();
	}
}