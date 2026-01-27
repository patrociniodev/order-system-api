package br.com.isaacpatrocinio.ordersystemapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.isaacpatrocinio.ordersystemapi.entities.OrderItem;
import br.com.isaacpatrocinio.ordersystemapi.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
