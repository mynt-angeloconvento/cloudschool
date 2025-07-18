package com.example.demo.myfirstapi.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductTest {
    private Product product;
    private Product product2;

    @BeforeEach
    void setUp() {
        product = new Product(0L, "Milk", 25.25);
        product2 = new Product(0L, "Milk", 25.25);
    }

    @AfterEach
    void tearDown() {
        product = null;
        product2 = null;
    }

    @Test
    void testEquals() {
        boolean result = product.equals(product2);
        assertTrue(result);
    }

    @Test
    void testGetId() {
        long result = product.getId();
        assertEquals(0L, result);
    }

    @Test
    void testGetName() {
        String result = product.getName();
        assertEquals("Milk", result);

    }

    @Test
    void testGetPrice() {
        double result = product.getPrice();
        assertEquals(25.25, result);

    }

    @Test
    void testHashCode() {
        Object result = product.hashCode();
        Object result2 = product2.hashCode();
        assertEquals(result, result2);
    }

    @Test
    void testSetId() {
        product.setId(1L);
        long result = product.getId();
        assertEquals(1L, result);
    }

    @Test
    void testSetName() {
        product.setName("Cheese");
        String result = product.getName();
        assertEquals("Cheese", result);
    }

    @Test
    void testSetPrice() {
        product.setPrice(420.69);
        double result = product.getPrice();
        assertEquals(420.69, result);
    }

    @Test
    void testToString() {
        String result = product.toString();
        assertEquals("Product{" +
                "id=" + 0L +
                ", name='" + "Milk" + '\'' +
                ", price=" + 25.25 +
                '}', result);
    }

}
