
public class Cat extends Animal {
	public Cat() {
		
	}
	
	public Cat(int tagId, String name) {
		super(tagId, name);
	}

	@Override
	public void eat() {
		System.out.println("Cat is eating ...");
	}

	@Override
	public void sleep() {
		System.out.println("Cat is sleeping ... ");
	}

}