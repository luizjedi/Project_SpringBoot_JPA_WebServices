package com.bestApps.FirstProjectSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bestApps.FirstProjectSpring.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	// ja possui implementação padrão.
}
