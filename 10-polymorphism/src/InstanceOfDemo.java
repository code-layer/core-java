
public class InstanceOfDemo {
	public static void main(String[] args) {
		Employee[ ] workingEmployees
			= new Employee[3];
		
		workingEmployees[0] = new Employee();
		workingEmployees[1] = new Developer();
		workingEmployees[2] = new Manager();

		processAllEmployees(workingEmployees);
		
		checkTypeInfo(workingEmployees);
	}

	private static void checkTypeInfo(Employee[] empData ) {
		System.out.println(" *** Check objects Type info *** ");
		for(Employee emp : empData) {
			if(emp instanceof Manager){
				System.out.println("Instance of Manager");
			} else if(emp instanceof Developer){
				System.out.println("Instance of Developer");
			} else if(emp instanceof Employee){
				System.out.println("Instance of Employee");
			}
		}
		
	}

	private static void processAllEmployees(Employee[] workingEmployees) {
		System.out.println(" *** Process All Employees *** ");
		for(Employee emp : workingEmployees){
			emp.dispDetails();
		}
	}

}