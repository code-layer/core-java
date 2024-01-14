package in.datalayer;

public class ReadNews extends Thread {
	private int maxFeeds,gap;
	
	public ReadNews(String channelName,int maxFeeds,int gap) {
		super(channelName);
		this.maxFeeds = maxFeeds;
		this.gap = gap;
	}

	@Override
	public void run() {
		int feedNo = 1;
		while (true) {
			System.out.println("Feed : " + feedNo + " Reading news from :" + super.getName());
			feedNo++;
			
			try {
				Thread.sleep( gap );
			} catch (InterruptedException e) {
				System.out.println("News Feed Thread Interrupted");
			}
			
			if(feedNo > maxFeeds)
				break;

		}//end of while
	}//end of run
}