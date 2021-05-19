package com.bestApps.FirstProjectSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bestApps.FirstProjectSpring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	// ja possui implementação padrão.
}
