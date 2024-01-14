package in.datalayer;

public class PageCountTask extends Thread {
	private PageVisitorCount pvc;
	
	public PageCountTask(String sourceName, PageVisitorCount pvc){
		super(sourceName);
		this.pvc = pvc;
	}
	
	@Override
	public void run() {
		int no = 1;
		int count = 0;
		
		while (true) {
			synchronized (pvc) {
				count =  pvc.getCount() ;
				count++;
				pvc.setCount(count);
			}
		
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				
			}
			no++;
			if(no > 100)
				break;
		}
	}
}