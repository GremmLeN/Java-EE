package ru.geekbrains.persist;

public class Product {

    private Long id;

    private String productName;

    Product() {
    }

    public Product(Long id, String productName) {
        this.id = id;
        this.productName = productName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setProduct_name(String productName) {
        this.productName = productName;
    }
}
