package com.trendyol.stock.service;

import com.trendyol.stock.dto.AddCategoryDto;
import com.trendyol.stock.dto.CategoryDto;
import com.trendyol.stock.entity.Category;
import com.trendyol.stock.mapper.CategoryMapper;
import com.trendyol.stock.repository.CategoryRepository;
import com.trendyol.stock.response.CategoryResponse;

public class CategoryService {

    private final CategoryRepository categoryRepository;
    private final CategoryMapper categoryMapper;

    public CategoryService(CategoryRepository categoryRepository,
                           CategoryMapper categoryMapper) {
        this.categoryRepository = categoryRepository;
        this.categoryMapper = categoryMapper;
    }

    public Category findCategory(int categoryId){
        return categoryRepository.findByCategoryId(categoryId);
    }

    public CategoryResponse findCategoryWithResponse(int categoryId) {
        CategoryResponse response = new CategoryResponse();
        response.category = categoryMapper.toDto(categoryRepository.findByCategoryId(categoryId));
        return response;
    }

    public CategoryResponse addCategory(AddCategoryDto dto) {
        CategoryResponse response = new CategoryResponse();
        Category category = categoryMapper.toEntity(new CategoryDto(dto.categoryName));
        category = categoryRepository.save(category);
        response.category=categoryMapper.toDto(category);
        return response;
    }
}
