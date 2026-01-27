package br.com.isaacpatrocinio.ordersystemapi.entities.pk;

import java.io.Serializable;

import br.com.isaacpatrocinio.ordersystemapi.entities.Order;
import br.com.isaacpatrocinio.ordersystemapi.entities.Product;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;

@Embeddable
public class OrderItemPK implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinTable(name = "order_id")
	private Order order;
	
	@ManyToOne
	@JoinTable(name = "product_id")
	private Product product;
	
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
}
