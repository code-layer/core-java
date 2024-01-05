package in.datalayer;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MakePhotoCopy {
	public static void main(String[] args) throws IOException {
		String inputPhoto = "D:\\tmp\\surf.jpg";
		String outputPhoto = "D:\\tmp\\new-surf.jpg";

		// copyPhotoUsingByte(inputPhoto, outputPhoto);
		// copyPhotoUsingByteArray(inputPhoto,outputPhoto);
	}

	private static void copyPhotoUsingByteArray(String inputPhoto, String outputPhoto) 
			throws IOException {
		FileInputStream fis = new FileInputStream(inputPhoto);
		FileOutputStream fos = new FileOutputStream(outputPhoto);
		byte data[] = new byte[1024];
		int bytesRead= 0;
		while(fis.available() > 0){
			bytesRead = fis.read(data);
			if(bytesRead == -1)
				break;
			fos.write(data);
		}
		fos.close();
		fis.close();
	}

	private static void copyPhotoUsingByte(String inputPhoto, String outputPhoto) 
			throws IOException {
		// read binary data from Photo
		FileInputStream fis = new FileInputStream(inputPhoto);
		// write data into new copy of photo
		FileOutputStream fos = new FileOutputStream(outputPhoto);
		while(true){
			int readByte = fis.read();
			if(readByte != -1) 
				fos.write(readByte);
			else
				break;
		}
		fos.close();
		fis.close();
	}
}