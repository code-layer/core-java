package in.datalayer;

public class NewsApp {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("*** Multi threads using Thread class ****");
		ReadNews news1 = new ReadNews("Star News", 10, 1000);
		ReadNews news2 = new ReadNews("Zee Cinema News", 50, 500);

		news1.start();
		news2.start();


        System.out.println("*** Multi threads using Runnable interface ****");
        ReadRssFeeds in1 = new ReadRssFeeds("BBC News", 10, 1000 );
		Thread rssThread1 = new Thread(in1);
		ReadRssFeeds in2 = new ReadRssFeeds("CNN News", 50, 500 );
		Thread rssThread2 = new Thread(in2);
		rssThread1.start();
		rssThread2.start();
    }
}