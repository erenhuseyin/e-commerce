package com.trendyol.stock.mapper;

import com.trendyol.stock.dto.CategoryDto;
import com.trendyol.stock.entity.Category;
import org.mapstruct.Mapper;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.salesforce.atrium")
@Mapper(componentModel = "spring")
public interface CategoryMapper extends IEntityMapper<CategoryDto, Category>{
}
