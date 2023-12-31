
public class GCDemo {
	public static void main(String[] args) {
		// one object - one reference
		Student stud = null;		// null reference
		System.out.println("stud ref value: " + stud);
		
		// allocate memory for stud
		stud = new Student();
		stud.setStudentData(68, "Mohan Raju");
		System.out.println("latest stud ref value: " + stud);
		
		stud = null;	// stud object is eligible for GC
	}

}