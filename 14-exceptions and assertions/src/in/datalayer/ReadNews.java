package in.datalayer;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadNews {
	public static void main(String[] args) {
		String filePath = "D:\\tmp\\news.txt";
		try {
			FileReader fr = new FileReader(filePath);
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}
	}

}