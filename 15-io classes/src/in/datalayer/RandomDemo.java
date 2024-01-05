package in.datalayer;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomDemo {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = null;
		String filePath = "D:\\tmp\\news.txt";
		
		raf = new RandomAccessFile(filePath, "r");
		String lineOfNews = raf.readLine();
		System.out.println("News Line: " + lineOfNews);
	
		raf.seek(43);
		System.out.println("Random News Line: " + raf.readLine());
		
		raf.close();
	}
}