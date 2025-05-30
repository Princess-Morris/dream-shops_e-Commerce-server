package com.princess.dream_shops.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.princess.dream_shops.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    Category findByName(String name);

}
