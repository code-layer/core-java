
public class StaticDemo {
	public static void main(String[] args) {
		ContractEmployee e1 = new ContractEmployee(10, "Kiran");
		System.out.println("Contract Employee Count: "
				+ ContractEmployee.getEmpCount());
		
		ContractEmployee e2 = new ContractEmployee(11, "Ramesh");
		System.out.println("Contract Employee Count: "
				+ ContractEmployee.getEmpCount());
		
		ContractEmployee e3 = new ContractEmployee(12, "Hanu");
		System.out.println("Contract Employee Count: "
				+ ContractEmployee.getEmpCount());
	}

}