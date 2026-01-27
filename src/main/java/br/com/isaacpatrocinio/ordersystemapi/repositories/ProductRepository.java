package br.com.isaacpatrocinio.ordersystemapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.isaacpatrocinio.ordersystemapi.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
