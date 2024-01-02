public abstract class Animal {
	private int tagId;
	private String name;
	
	public Animal() {
		
	}
	
	public Animal(int tagId, String name) {
		super();
		this.tagId = tagId;
		this.name = name;
	}

	public abstract void eat();
	public abstract void sleep();

	public void animalDetails() {
		System.out.println("Tag Id: " + tagId );
		System.out.println("Name: " + name );
	}
	
}