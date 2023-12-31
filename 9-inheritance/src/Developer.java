
public class Developer extends Employee {
	private String[ ] workingProjects;
	
	public Developer( ) {
		
	}

	public Developer(int empId, String ename, double sal,
			String[] workingProjects) {
		super(empId, ename, sal);
		this.workingProjects = workingProjects;
	}

	@Override
	public void dispDetails () {
		super.dispDetails();
		System.out.println("Developer working on projects");
		for(String project: workingProjects) {
			System.out.println("   Project : " + project);
		}
	}
	
}