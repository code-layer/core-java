
public class CloneClientDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		Dog d1 = new Dog("Tommy");
		System.out.println("D1 Dog name: " + d1.getName() );
		
		Dog d2 = (Dog) d1.clone();
		System.out.println("D2 Dog name: " + d2.getName() );
		d2.setName("Gimmy");
		System.out.println("D2 Dog name: " + d2.getName() );
	}

}