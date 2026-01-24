package br.com.isaacpatrocinio.ordersystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.isaacpatrocinio.ordersystem.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
