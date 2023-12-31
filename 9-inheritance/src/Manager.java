
public class Manager extends Employee {
	private double carAllowance;
	
	public Manager() {
		
	}
	
	public Manager(int empId, String ename, double sal, double carAllowance) {
		super(empId, ename, sal);
		this.carAllowance = carAllowance;
	}

	public void dispManagerDetails() {
		System.out.println("Car Allowance: " + carAllowance);
	}
	
	public double getSalary(){
		return super.getSal() + carAllowance;
	}
	
}