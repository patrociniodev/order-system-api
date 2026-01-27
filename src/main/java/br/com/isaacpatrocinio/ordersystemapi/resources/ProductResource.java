package br.com.isaacpatrocinio.ordersystemapi.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.isaacpatrocinio.ordersystemapi.entities.Product;
import br.com.isaacpatrocinio.ordersystemapi.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

	@Autowired
	private ProductService productService;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id) {
		return ResponseEntity.ok().body(productService.findById(id));
	}
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll() {
		return ResponseEntity.ok().body(productService.findAll());
	}
}
