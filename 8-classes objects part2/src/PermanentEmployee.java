
public class PermanentEmployee {
	private int eid;
	private String ename;
	
	public PermanentEmployee() {
		eid = 0;
		ename = "";
	}
	
	// fields and constructor param names are same
	public PermanentEmployee(int eid, String ename) {
		this.eid = eid;
		this.ename = ename;
	}
	
	public PermanentEmployee(int eid) {
		this();		// call constructor with 0 args
	}

	public void dispEmployeeDettails( ) {
		System.out.println("Employee Id: " + eid);
		System.out.println("Employee Name: " + ename);
	}
	
}