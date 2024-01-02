
public class Dog extends Animal {
	public Dog() {
		
	}
	
	public Dog(int tagId, String name) {
		super(tagId, name);
	}

	@Override
	public void eat() {
		System.out.println("Dog is eating ...");
	}

	@Override
	public void sleep() {
		System.out.println("Dog is sleeping ... ");
	}

}