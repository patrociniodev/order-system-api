package br.com.isaacpatrocinio.ordersystemapi.entities.enums;

public enum OrderStatus {
	WAITING_PAYMENT(1), PAID(2), SHIPPED(3), DELIVERED(4), CANCELED(5);

	private int code;

	// Private constructor
	private OrderStatus(int statusCode) {
		this.code = statusCode;
	}

	public int getCode() {
		return code;
	}

	public static OrderStatus valueOf(int code) {

		for (OrderStatus orderStatus : OrderStatus.values()) {
			if (orderStatus.getCode() == code) {
				return orderStatus;
			}
		}

		// If parameter invalid
		throw new IllegalArgumentException("Invalid OrderStatus code.");
	}
}
