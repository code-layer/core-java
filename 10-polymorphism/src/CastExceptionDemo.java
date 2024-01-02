
public class CastExceptionDemo {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		
		Manager m1 = (Manager) e1;
		m1.dispDetails();

	}

}