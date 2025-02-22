package com.example.productcrud.model;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.math.BigDecimal;
import java.util.UUID;

@Table("products")

public class Product {

    @PrimaryKey
    private UUID id;
    private String name;
    private String description;
    private BigDecimal price;
    private int quantity;

    public Product() {
    }

    public Product(UUID id, int quantity, BigDecimal price, String description, String name) {
        this.id = id;
        this.quantity = quantity;
        this.price = price;
        this.description = description;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
