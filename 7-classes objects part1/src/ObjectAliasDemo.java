
public class ObjectAliasDemo {
	public static void main(String[] args) {
		Student stud = new Student();
		stud.setStudentData(67, "Sudha Chandran");
		System.out.println("Display stud Details");
		stud.dispStudentData();

		Student s = stud;
		System.out.println("Display s Details");
		s.dispStudentData();
		
		// change sname of s object
		s.changeName("Mayuri Sudha");
		System.out.println("Display s Details after name change");
		s.dispStudentData();
	}

}