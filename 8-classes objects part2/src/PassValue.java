
public class PassValue {
	public static void main(String[] args) {
		int count = 123;
		dispValue(count);
		System.out.println(" ***  pass value *** ");
		System.out.println(" count value after method call: " + count);
		
		Employee e1 = new Employee("Satish", 20.45);
		e1.viewEmpDetails();
		System.out.println(" ***  pass reference *** ");
		processEmployee(e1);
		System.out.println("E1 details after processing");
		e1.viewEmpDetails();
	}
	
	public static void dispValue(int count) {
		System.out.println("count value is: 123");
	}
	
	public static void processEmployee(Employee emp) {
		emp.changeName("Satish Krishna");
	}

}