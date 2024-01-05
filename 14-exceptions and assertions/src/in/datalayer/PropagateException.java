package in.datalayer;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class PropagateException {
	public static void main(String[] args) {
		String filePath = "D:\\tmp\\test-news.txt";
		try {
			processNews(filePath);
		} catch (FileNotFoundException fnfe) {
			System.out.println("*** Handling exceptions in MAIN ***");
			fnfe.printStackTrace();
		}
	}

	private static void processNews(String filePath) throws FileNotFoundException {
		processAntiVirus(filePath);
		System.out.println(" **** News is processed ***");
	}

	private static void processAntiVirus(String filePath) throws FileNotFoundException {
			FileReader fr = new FileReader(filePath);
			System.out.println(" **** Anti Virus is Verified ***");
	}
}