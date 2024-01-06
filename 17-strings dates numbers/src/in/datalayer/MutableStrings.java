package in.datalayer;

public class MutableStrings {
	public static void main(String[] args) {
		StringBuffer compName = new StringBuffer("ABC Consultants");
		compName.append(" Pvt Ltd");
		System.out.println(" comp name : " + compName);
		
		compName.reverse();
		System.out.println(" reverse comp name : " + compName);
		compName.reverse();
		compName.delete(0, 4);
		System.out.println(" after delete comp name :" + compName);
	}
}