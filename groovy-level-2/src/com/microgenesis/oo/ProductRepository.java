package com.microgenesis.oo;

import java.util.Arrays;
import java.util.List;

public class ProductRepository {
    public List<Product> findAll() {
        Product product1 = new Product();
        product1.setId(1);
        product1.setProductName("Phone");
        product1.setInStock(true);
        product1.setPrice(23.89);
        product1.setQty(100);

        Product product2 = new Product();
        product2.setId(2);
        product2.setProductName("TV");
        product2.setInStock(true);
        product2.setPrice(29993.89);
        product2.setQty(10000);

        return Arrays.asList(product1, product2);
    }
}
