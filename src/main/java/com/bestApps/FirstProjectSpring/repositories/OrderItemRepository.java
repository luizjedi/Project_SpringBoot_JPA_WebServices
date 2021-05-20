package com.bestApps.FirstProjectSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bestApps.FirstProjectSpring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

	// ja possui implementação padrão.
}
