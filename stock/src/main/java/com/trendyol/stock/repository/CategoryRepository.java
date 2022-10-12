package com.trendyol.stock.repository;

import com.trendyol.stock.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
    public Category findByCategoryId(int categoryId);
}
