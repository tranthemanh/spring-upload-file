package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService implements IProductService {
    private static final List<Product> products;

    static {
        products = new ArrayList<>();
        products.add( new Product(1, "BimBim", "Bim Bim sieu"));
        products.add( new Product(2, "Bia", "Bia 333"));
        products.add( new Product(3, "Pessi", "Nuoc ngot co ga"));
        products.add( new Product(4, "CocaCola", "Nuoc co ga"));
    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public void save(Product product) {
        products.add(product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        int index = products.indexOf(findById(id));
        products.set(index, product);
    }

    @Override
    public void remove(int id) {
        products.remove(findById(id));
    }
}