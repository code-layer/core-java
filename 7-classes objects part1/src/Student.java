public class Student {
    private int    sno;
    private String sname;

    public void setStudentData(int  id,  String  name ) {
    	sno = id;
    	sname = name;
    }
    
    public void dispStudentData() {
    	System.out.println("Student No: " + sno);
    	System.out.println("Student Name: " + sname);
    }

    public void changeName(String name){
    	sname = name;
    }
    
    public static void main(String[] args) {
    	//create new object for Student class
    	Student stud = new Student();
    	System.out.println("Display stud object default values");
    	stud.dispStudentData();
    	
    	//change object sno and sname
    	stud.setStudentData(100 , "Vasantha Kumar");
    	System.out.println("Display latest stud object values");
    	stud.dispStudentData();
    }
}