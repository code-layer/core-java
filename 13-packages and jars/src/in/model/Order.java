package in.model;

public class Order {
	private int orderId;
	private String custDetails;
	
	public Order(int orderId, String custDetails) {
		super();
		this.orderId = orderId;
		this.custDetails = custDetails;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", custDetails=" + custDetails + "]";
	}

}