
public class ObjectAliasGCDemo {
	public static void main(String[] args) {
		// one object - 2 references
		Student stud = new Student();
		stud.setStudentData(67, "Sudha Chandran");
		System.out.println("Display stud Details");
		stud.dispStudentData();

		Student s = stud;
		System.out.println("Display s Details");
		s.dispStudentData();
		
		s = null;
		// object is not eligible for GC
		// stud is still referencing Object
		
		stud = null;
		// now object is eligible for GC
	}

}