public class Client {
	public static void main(String[] args) {
		Animal[ ] animals = new Animal[2];
		animals[0] = new Dog(100, "Puppy");
		animals[1] = new Cat(101, "Kitty");
	
		processAnimals(animals);
	}

	private static void processAnimals(Animal[] animals) {
		System.out.println(" *** process all animal details *** ");
		for( Animal animal : animals) {
			animal.animalDetails();
			animal.eat();
			animal.sleep();
		}
		
	}
	
}