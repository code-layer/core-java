public class Client {
	public static void main(String[] args) {
		// inheritance
		Manager manager = 
				new Manager(120, "Kantheti Satish", 12000.0,
						1250.50);
		
		System.out.println(" *** Manager Details *** ");
		manager.dispDetails();
		manager.dispManagerDetails();
		
		System.out.println("Manager Total Salary: " 
					+ manager.getSalary());
		
		// method over riding
		String[] projects = new String[2];
		projects[0] = "Lead Management System";
		projects[1] = "GL - General Ledger";
		
		System.out.println();
		System.out.println(" *** Developer Details *** ");
		Developer developer =
				new Developer(121, "Ratna Gopal", 18000.0, projects);
		developer.dispDetails();
		
	}
}