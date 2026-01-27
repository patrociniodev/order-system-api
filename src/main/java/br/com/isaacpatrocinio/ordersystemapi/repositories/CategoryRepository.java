package br.com.isaacpatrocinio.ordersystemapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.isaacpatrocinio.ordersystemapi.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
