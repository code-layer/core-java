package in.datalayer;

import java.util.Scanner;

public class ReadInputDemo2 {
	public static void main(String[] args) {
		// using Scanner class
		Scanner scanner = new Scanner(System.in);
		System.out.print("Your Name : ");
		String name = scanner.nextLine();
		 
		System.out.print("Your Credit Score (int) : ");
		int score = scanner.nextInt();
		
		System.out.println(" ** Your details *** ");
		System.out.println("Name : " + name);
		System.out.println("Credit Score: " + score);
		
		scanner.close();
	}
}