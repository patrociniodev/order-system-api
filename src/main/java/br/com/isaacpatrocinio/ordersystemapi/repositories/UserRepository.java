package br.com.isaacpatrocinio.ordersystemapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.isaacpatrocinio.ordersystemapi.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
