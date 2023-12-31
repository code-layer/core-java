
public class ContractEmployee {
	private int eid;
	private String ename;
	private static int empCount;
	
	public ContractEmployee(int eid, String ename) {
		this.eid = eid;
		this.ename = ename;
		empCount++;
	}
	
	public static int getEmpCount() {
		return empCount;
	}
	
}