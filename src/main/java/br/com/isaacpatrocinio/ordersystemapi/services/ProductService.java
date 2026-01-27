package br.com.isaacpatrocinio.ordersystemapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.isaacpatrocinio.ordersystemapi.entities.Product;
import br.com.isaacpatrocinio.ordersystemapi.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public Product findById(Long id) {
		return productRepository.findById(id).get();
	}
	
	public List<Product> findAll() {
		return productRepository.findAll();
	}
}
