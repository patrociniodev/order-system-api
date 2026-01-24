package br.com.isaacpatrocinio.ordersystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.isaacpatrocinio.ordersystem.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
