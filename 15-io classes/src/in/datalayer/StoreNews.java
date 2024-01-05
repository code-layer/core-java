package in.datalayer;

import java.io.FileWriter;
import java.io.IOException;

public class StoreNews {
	public static void main(String[] args) throws IOException {
		String filePath = "D:\\tmp\\news.txt";
		FileWriter fw = new FileWriter(filePath);
		fw.write("Todays Bombay News");
		fw.write("\n");
		fw.write("10 Jan 2016 Heavy rains");
		fw.write("\n");
		fw.write("Local Trains stopped due to floods");
		fw.close();
	}
}