package in.client;

import in.model.Order;

public class ApplicationClient {
	public static void main(String[] args) {
		Order o1 = new Order(1001,"Ravi K, 31 MG Road, Bangalore 560 003");
		System.out.println( o1.toString() );
	}
}