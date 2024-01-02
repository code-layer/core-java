
public class Client {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		
		//upcast
		Employee e2 = new Manager();
		System.out.println(" ***  e2 details *** ");
		e2.dispDetails();

		// downcast
		Manager m1 = (Manager) e2;
		System.out.println(" ***  m1 details *** ");
		m1.dispDetails();
		m1.managerAdditionalInfo();
	}

}