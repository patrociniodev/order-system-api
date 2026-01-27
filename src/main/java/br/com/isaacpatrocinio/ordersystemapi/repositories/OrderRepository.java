package br.com.isaacpatrocinio.ordersystemapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.isaacpatrocinio.ordersystemapi.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
