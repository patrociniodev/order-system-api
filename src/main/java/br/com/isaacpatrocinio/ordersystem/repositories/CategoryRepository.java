package br.com.isaacpatrocinio.ordersystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.isaacpatrocinio.ordersystem.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
