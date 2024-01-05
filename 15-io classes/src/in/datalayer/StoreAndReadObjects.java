package in.datalayer;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StoreAndReadObjects {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		NewsAccess na = new NewsAccess();
		na.setUserId(121);
		na.setPassWord("Code@76");
		
		String filePath = "D:\\tmp\\news-access.ser";
		serializeObject(na, filePath);
		
		deserializeObject(filePath);
	}

	private static void deserializeObject(String filePath) 
			throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(filePath);
		ObjectInputStream ois = new ObjectInputStream(fis);
		NewsAccess accessObject = (NewsAccess) ois.readObject();
		System.out.println(" *** News Access Details *** ");
		System.out.println("Access User Id: " + accessObject.getUserId() );
		System.out.println("Access Password: " + accessObject.getPassWord());

		ois.close();
		fis.close();
	}

	private static void serializeObject(NewsAccess na, String filePath) 
			throws IOException {
		FileOutputStream fos = new FileOutputStream(filePath);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(na);
		
		oos.close();
		fos.close();
	}
}