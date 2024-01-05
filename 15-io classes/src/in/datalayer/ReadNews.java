package in.datalayer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadNews {
	public static void main(String[] args) throws IOException {
		String filePath = "D:\\tmp\\news.txt";
		System.out.println("*** news data bye by byte **** ");
		readFileByteWise(filePath);
		System.out.println("\n *** news data line by line **** ");
		readFileUsingProcessingStreams(filePath);
	}

	private static void readFileByteWise(String filePath) throws IOException {
		FileReader fr = new FileReader(filePath);
		int intChar;
		while(true) {
			intChar = fr.read();
			if(intChar != -1)
				System.out.print((char) intChar);
			else
				break;
		}
		fr.close();
	}

	private static void readFileUsingProcessingStreams(String filePath) 
			throws IOException {
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		while(true) {
			String lineOfText = br.readLine();
			if(lineOfText != null)
				System.out.println(lineOfText);
			else
				break;
		}
		br.close();
		fr.close();
	}
}