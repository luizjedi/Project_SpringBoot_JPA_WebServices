package com.bestApps.FirstProjectSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bestApps.FirstProjectSpring.entities.Category;
import com.bestApps.FirstProjectSpring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	// ja possui implementação padrão.
}
