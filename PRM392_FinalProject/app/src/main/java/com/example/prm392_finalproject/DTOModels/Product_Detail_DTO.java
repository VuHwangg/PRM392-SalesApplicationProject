package com.example.prm392_finalproject.DTOModels;

import java.io.Serializable;

public class Product_Detail_DTO implements Serializable {
    private int id;
    private String image;
    private String name;
    private double price;
    private double discount;
    private String description;
    private String supplier;
    private boolean category;
    private String color;

    public Product_Detail_DTO(int id, String image, String name, double price, double discount, String description, String supplier, boolean category, String color) {
        this.id = id;
        this.image = image;
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.description = description;
        this.supplier = supplier;
        this.category = category;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isCategory() {
        return category;
    }

    public void setCategory(boolean category) {
        this.category = category;
    }
}
