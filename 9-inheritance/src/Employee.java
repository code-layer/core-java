
public class Employee {
	private int empId;
	private String ename;
	private double sal;
	
	public Employee( ) {
		
	}
	
	public Employee( int empId, String ename,double sal){
		this.empId = empId;
		this.ename = ename;
		this.sal = sal;
	}
	
	public double getSal( ) {
		return sal;
	}
	
	public void dispDetails( ) {
		System.out.println("Employee Id: " + empId);
		System.out.println("Employee Name: " + ename);
		System.out.println("Employee Salary: " + sal);
	}
	
}