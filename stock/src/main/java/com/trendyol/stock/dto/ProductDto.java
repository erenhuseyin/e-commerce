package com.trendyol.stock.dto;

import java.io.Serializable;

public class ProductDto implements Serializable {

    public int productId;
    private String productName;
    private double price;
    private int quantity;
    public int categoryId;
}
