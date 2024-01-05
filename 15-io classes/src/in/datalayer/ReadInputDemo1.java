package in.datalayer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadInputDemo1 {
	public static void main(String[] args) throws IOException {
		// use BufferedReader
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.print("Enter You Name: ");
		String name = br.readLine();
		System.out.println("You name: " + name);
	
		br.close();
	}

}