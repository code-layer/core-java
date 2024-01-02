
public class Client {
	public static void main(String[] args) {
		System.out.println(" *** default Object methods  *** ");
		Employee e1 = new  Employee(120, "Sudha P");
		Employee e2 = new  Employee(120, "sudha p");

		System.out.println(e1.toString());
		System.out.println(e1.hashCode());
		System.out.println(e1.equals(e2));

		System.out.println(" *** overridden Object methods  *** ");
		ContractEmployee ce1 = new ContractEmployee(221, "Haranath Puram");
		ContractEmployee ce2 = new ContractEmployee(221, "Haranath Puram");
		System.out.println(ce1.toString());
		System.out.println(ce1.hashCode());
		System.out.println(ce1.equals(ce2));
	}
}