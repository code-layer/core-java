package in.datalayer;

public class DefaultThreadDemo {
	public static void main(String[] args) {
		Thread defaultThread = Thread.currentThread();

		System.out.println(" *** Thread Details ***");
		System.out.println("Id:" + defaultThread.getId());
		System.out.println("Name:" + defaultThread.getName());
		System.out.println("Priority:" + defaultThread.getPriority());
		System.out.println("State:" + defaultThread.getState());
	}
}