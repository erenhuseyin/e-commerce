package com.trendyol.basket.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class BasketProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int basketProductId;
    private int count;
    private double amount;
    private int productId;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "basketId")
    private Basket basket;
}
