package in.datalayer;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class MyFileExplorer {
	public static void main(String[] args) throws IOException {
		String filePath = "D:\\tmp\\news.txt";
		File fileExplorer = new File(filePath);
		
		System.out.println("*** my file explorer details **** ");
		System.out.println("file is present: " + fileExplorer.exists());
		System.out.println("file is directory :" + fileExplorer.isDirectory());
		System.out.println("file last modified details: " + 
				new Date(fileExplorer.lastModified()));
		
		String dirPath = "D:\\tmp\\StarNews\\";
		File f = new File(dirPath);
		if( !f.exists()){
			f.mkdir();
			String fileName = "sports-news.txt";
			File sportsFile = new File(dirPath + fileName);
			sportsFile.createNewFile();
		}
	}

}