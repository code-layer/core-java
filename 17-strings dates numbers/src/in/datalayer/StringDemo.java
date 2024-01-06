package in.datalayer;

public class StringDemo {
	public static void main(String[] args) {
		String studName = "kumar";
		String empName = "kumar";
		
		System.out.println(" *** stud and emp name details ***");
		System.out.println(" Stud Name: " + studName);
		System.out.println(" Emp Name: " + empName);

		// change empName
		empName = "Vasantha Kumar";
		System.out.println(" Emp Name: " + empName);
		
		System.out.println(" *** String Class Methods *** ");
		System.out.println("Stud Name Length: " + studName.length());
		System.out.println("Stud Name from 2 Char: " + studName.substring(2));
		System.out.println("Stud Name index of ar : " + studName.indexOf("ar"));
		System.out.println("Compare Names : " + studName.compareTo(empName));
	}
}