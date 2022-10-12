package com.trendyol.basket.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Basket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int basketId;
    private double amount;
    private int status;
    private int userId;

    @OneToMany(mappedBy = "basket")
    @JsonManagedReference
    private List<BasketProduct> basketProductList;
}
