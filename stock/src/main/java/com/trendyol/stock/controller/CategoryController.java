package com.trendyol.stock.controller;

import com.trendyol.stock.dto.AddCategoryDto;
import com.trendyol.stock.response.CategoryResponse;
import com.trendyol.stock.service.CategoryService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/category")
public class CategoryController {

    CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/find/{categoryId}")
    public CategoryResponse getCategoryByCategoryId(@PathVariable(name = "categoryId")String categoryId){
        return categoryService.findCategoryWithResponse(Integer.parseInt(categoryId));
    }

    @PostMapping("/add")
    public CategoryResponse addCategory(@RequestBody AddCategoryDto dto){
        return categoryService.addCategory(dto);
    }
}
