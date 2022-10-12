package com.trendyol.stock.mapper;

import com.trendyol.stock.dto.ProductDto;
import com.trendyol.stock.entity.Product;
import org.mapstruct.Mapper;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.salesforce.atrium")
@Mapper(componentModel = "spring")
public interface ProductMapper extends IEntityMapper<ProductDto, Product> {
}
