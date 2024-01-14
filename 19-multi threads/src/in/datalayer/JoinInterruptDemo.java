package in.datalayer;

public class JoinInterruptDemo {
	public static void main(String[] args) throws InterruptedException {

		/* join method */
		ReadRssFeeds in1 = new ReadRssFeeds("BBC News", 3, 15000 );
		Thread rssThread1 = new Thread(in1);
		
		ReadRssFeeds in2 = new ReadRssFeeds("CNN News", 5, 1000 );
		Thread rssThread2 = new Thread(in2);
		System.out.println(" *** BBC News starting ***");
		rssThread1.start();
		System.out.println(" *** Wait for BBC News to complete ***");
		rssThread1.join();	//wait for thread o complete
		
		System.out.println(" *** CNN News Staring ***");
		rssThread2.start();

		/* interrup demo */
		ReadRssFeeds in1 = new ReadRssFeeds("BBC News", 30, 1000 );
		Thread rssThread1 = new Thread(in1);
		rssThread1.start();
		ReadRssFeeds in2 = new ReadRssFeeds("CNN News", 25, 1000 );
		Thread rssThread2 = new Thread(in2);
		rssThread2.start();
		
		Thread.sleep(10000);
		rssThread1.interrupt();
		System.out.println("BCC News Interrupted isAlive : " + rssThread1.isAlive());
	}
}