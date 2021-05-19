package com.bestApps.FirstProjectSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bestApps.FirstProjectSpring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

	// ja possui implementação padrão.
}
