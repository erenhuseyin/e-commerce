package com.trendyol.stock.dto;


import java.io.Serializable;
import java.util.List;

public class CategoryDto implements Serializable {
    //Java Serialization API sayesinde bir nesnenin birebir kopyasını, Java platformu dışında da depolayabiliriz.
    // Bu mekanizma ile daha sonra, nesneyi depolanan yerden çekip, aynı durum (state) ve özellikleri ile
    // kullanmaya devam edebiliriz. Tüm bu sisteme, Object Serialization (Nesne Serileştirme) adı verilir.
    private String categoryName;
    public List<ProductDto> productDtoList;

    public CategoryDto(String categoryName) {
        this.categoryName = categoryName;
    }
}

