package com.trendyol.stock.repository;

import com.trendyol.stock.entity.Category;
import com.trendyol.stock.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository {
    public Product findProductByProductId(int productId);
    public List<Product> findProductsByCategory(Category category);
}
