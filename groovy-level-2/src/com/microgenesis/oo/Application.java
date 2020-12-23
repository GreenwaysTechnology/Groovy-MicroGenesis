package com.microgenesis.oo;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        ProductService service = new ProductService();
        List<Product> products = service.findAll();
        for (Product product : products) {
            System.out.println(product.getId() + " " + product.getProductName());
        }
    }
}
