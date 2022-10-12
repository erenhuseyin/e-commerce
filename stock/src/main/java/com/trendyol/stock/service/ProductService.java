package com.trendyol.stock.service;

import com.trendyol.stock.dto.ProductDto;
import com.trendyol.stock.entity.Category;
import com.trendyol.stock.entity.Product;
import com.trendyol.stock.mapper.ProductMapper;
import com.trendyol.stock.repository.ProductRepository;
import com.trendyol.stock.response.ProductResponse;

import java.util.List;

public class ProductService {

    private final ProductRepository repository;
    private final ProductMapper mapper;
    private final CategoryService categoryService;

    public ProductService(ProductRepository repository,
                          ProductMapper mapper,
                          CategoryService categoryService) {
        this.repository = repository;
        this.mapper = mapper;
        this.categoryService = categoryService;
    }

    public ProductResponse findProduct(int productId) {
        ProductResponse response = new ProductResponse();
        response.product = mapper.toDto(repository.findProductByProductId(productId));
        return response;
    }

    public ProductResponse addProduct(ProductDto dto) {
        ProductResponse response = new ProductResponse();
        Product product = mapper.toEntity(dto);
        Category category = categoryService.findCategory(dto.categoryId);
        product.setCategory(category);
        repository.save(product);
        response.product=mapper.toDto(product);
        return response;
    }

    public List<Product> productList(int categoryId) {
        Category category = categoryService.findCategory(categoryId);
        return repository.findProductsByCategory(category);
    }
}
