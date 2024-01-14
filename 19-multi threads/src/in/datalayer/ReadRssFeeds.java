package in.datalayer;

public class ReadRssFeeds implements Runnable {
	private String channelName;
	private int maxFeeds,gap;
	
	public ReadRssFeeds(String channelName,int maxFeeds,int gap) {
		this.channelName = channelName;
		this.maxFeeds = maxFeeds;
		this.gap = gap;
	}

	@Override
	public void run() {
		int feedNo = 1;
		while (true) {
			System.out.println("Rss Feed : " + feedNo + " Reading news from :" + channelName);
			feedNo++;
			
			try {
				Thread.sleep( gap );
			} catch (InterruptedException e) {
				System.out.println("*** Rss Feed Thread Interrupted ***");
				System.out.println("*** Handling Thread Interrupted . Stopping  ...in 2 sec ... ***");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e1) {
				}
				break;
				
			}//end of catch block
			
			if(feedNo > maxFeeds)
				break;

		}//end of while block
		
	} //end of run method
}