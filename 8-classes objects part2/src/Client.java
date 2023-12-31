
public class Client {
	public static void main(String[] args) {
		// method overloading demo
		System.out.println("method overloading");
		Calculator c1 = new Calculator();
		System.out.println("Sum of 10,20 is : " + c1.add(10, 20));
		System.out.println("Sum of 10.12, 20.34 is : " 
							+ c1.add(10.12, 20.34));

		// constructors and method overloading
		System.out.println(" *** visitors method overloading *** ");
		Visitor v2 = new Visitor("Ramesh", "user@123", "Card@11");
		v2.login("Ramesh");
		System.out.println("");
		
		Visitor v3 = new Visitor("Kumar", "Admin@123", "Merc@11");
		v3.login("Kumar","Admin@123");

		// use default constructor provided by system
		System.out.println();
		BasicEmployee be = new BasicEmployee();
		be.viewEmpDetails();

		// use constructors
		Employee e1 = new Employee("Vijaya Kumar");
		e1.viewEmpDetails();
		
		Employee e2 = new Employee("Narra Sarala", 60.45);
		e2.viewEmpDetails();
		
	}

}