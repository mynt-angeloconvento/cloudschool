package com.example.demo.myfirstapi.repository;

import com.example.demo.myfirstapi.model.Product;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {
    private ProductRepository productRepository;

    @BeforeEach
    void setUp() {
        productRepository = new ProductRepository();
    }

    @AfterEach
    void tearDown() {
        productRepository = null;
    }

    @Test
    void findAll() {
        List<Product> products = productRepository.findAll();
        assertEquals(3, products.size());
    }

    @Test
    void findByIdExisting() {
        Optional<Product> result = productRepository.findById(1L);
        Optional<Product> expected = Optional.of(new Product(1L, "Laptop", 1200.0));
        assertEquals(expected,result);
    }

    @Test
    void findByIdNull() {
        Optional<Product> result = productRepository.findById(10L);
        assertEquals(Optional.empty(),result);
    }

    @Test
    void saveNewProduct() {
        productRepository.save(new Product("Milk", 25.25));
        Optional<Product> result = productRepository.findById(4L);
        Optional<Product> expected = Optional.of(new Product(4L, "Milk", 25.25));
        assertEquals(expected,result);
    }

    @Test
    void saveExistingProduct() {
        productRepository.save(new Product(3L,"Milk", 25.25));
        Optional<Product> result = productRepository.findById(3L);
        Optional<Product> expected = Optional.of(new Product(3L, "Milk", 25.25));
        assertEquals(expected,result);
    }
}