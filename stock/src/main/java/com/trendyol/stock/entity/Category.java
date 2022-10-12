package com.trendyol.stock.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int categoryId;
    private String categoryName;

    @OneToMany(mappedBy = "category")
    @JsonManagedReference//bağlantımızın sonsuz döngüye girmemesi için
    private List<Product> productList;


}
