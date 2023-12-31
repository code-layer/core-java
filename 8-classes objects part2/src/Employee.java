
public class Employee {
	private String empName;
	private double payRateMonth;
	
	public Employee(String name){
		empName = name;
		payRateMonth = 50.45;
	}
	
	public Employee(String name, double rate) {
		empName = name;
		payRateMonth = rate;
	}
	
	public void changeName(String name) {
		empName = name;
	}
	
	public void viewEmpDetails() {
		System.out.println("Employee Name: " + empName);
		System.out.println("Pay Rate per Month: " + payRateMonth);
	}
	
}