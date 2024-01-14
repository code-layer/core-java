package in.datalayer;

public class PageCountApp {
	public static void main(String[] args) throws InterruptedException {
		PageVisitorCount pvc = new PageVisitorCount();
		
		PageCountTask task1 = new PageCountTask("Desktop", pvc);
		PageCountTask task2 = new PageCountTask("Mobile", pvc);
		
		task1.start();
		task2.start();
		
		task1.join();
		task2.join();
		System.out.println("Total Page Visitor Count: " + pvc.getCount());
	}
}