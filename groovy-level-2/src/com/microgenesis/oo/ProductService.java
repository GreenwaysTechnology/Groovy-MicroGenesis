package com.microgenesis.oo;

import java.util.List;

public class ProductService {
    //declare variable
    private ProductRepository repository = new ProductRepository();

    public List<Product> findAll() {
        return repository.findAll();
    }
}
