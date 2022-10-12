package com.trendyol.stock.controller;

import com.trendyol.stock.dto.ProductDto;
import com.trendyol.stock.entity.Product;
import com.trendyol.stock.response.ProductResponse;
import com.trendyol.stock.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/find/{productId}")
    public ProductResponse findProduct(@PathVariable(value = "productId")int productId){
        return productService.findProduct(productId);
    }

    @PostMapping("/add")
    public ProductResponse addProduct(@RequestBody ProductDto dto){
        return productService.addProduct(dto);
    }

    @GetMapping("/findAll/{categoryId}")
    public List<Product> findProductByCategory(@PathVariable(value = "categoryId")int categoryId){
        return productService.productList(categoryId);
    }
}
