package br.com.isaacpatrocinio.ordersystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.isaacpatrocinio.ordersystem.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
