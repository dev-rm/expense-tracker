package com.expense.tracker.expense.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.expense.tracker.expense.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
	Category findByName(String name);

}
