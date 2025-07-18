package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void initialize() {
        calculator = new Calculator();
    }

    @AfterEach
    void tearDown() {
        calculator.turnOff();
        calculator = null;
    }

    @Test
    void shouldBeOffAtStart() {
        assertFalse(calculator.isOn());
    }

    @Test
    void shouldTurnOn() {
        calculator.turnOn();
        assertTrue(calculator.isOn());
    }

    @Test
    void shouldTurnOff() {
        calculator.turnOn();
        assertTrue(calculator.isOn());
        calculator.turnOff();
        assertTrue(calculator.isOff());
    }

    @Test
    void calculateIntegerSum() {
        calculator.turnOn();
        int result = calculator.sum(1, 5);
        assertEquals(6, result);
    }

    @Test
    void calculateLongSum() {
        calculator.turnOn();
        int result = calculator.sum(123456789, 987654321);
        assertEquals(1111111110, result);
    }

    @Test
    void calculateShortSum() {
        calculator.turnOn();
        int result = calculator.sum(1234, 5678);
        assertEquals(6912, result);
    }

    @Test
    void calculateDoubleSum() {
        calculator.turnOn();
        double result = calculator.sum(1.1, 5.5);
        assertEquals(6.6, result, .0001);
    }

    @Test
    void calculateFloatSum() {
        calculator.turnOn();
        float result = calculator.sum(1.1f, 5.5f);
        assertEquals(6.6f, result, 0.0001);
    }

    @Test
    void calculateIntegerDifference() {
        calculator.turnOn();
        int result = calculator.subtract(1, 5);
        assertEquals(-4, result);
    }

    @Test
    void calculateLongDifference() {
        calculator.turnOn();
        int result = calculator.subtract(123456789, 987654321);
        assertEquals(-864197532, result);
    }

    @Test
    void calculateShortDifference() {
        calculator.turnOn();
        int result = calculator.subtract(1234, 5678);
        assertEquals(-4444, result);
    }

    @Test
    void calculateDoubleDifference() {
        calculator.turnOn();
        double result = calculator.subtract(1.1, 5.5);
        assertEquals(-4.4, result, .0001);
    }

    @Test
    void calculateFloatDifference() {
        calculator.turnOn();
        float result = calculator.subtract(1.1f, 5.5f);
        assertEquals(-4.4f, result, 0.0001);
    }

    @Test
    void calculateIntegerProduct() {
        calculator.turnOn();
        int result = calculator.multiply(6, 5);
        assertEquals(30, result);
    }

    @Test
    void calculateLongProduct() {
        calculator.turnOn();
        int result = calculator.multiply(12345, 54321);
        assertEquals(670592745, result);
    }

    @Test
    void calculateShortProduct() {
        calculator.turnOn();
        int result = calculator.multiply(123, 456);
        assertEquals(56088, result);
    }

    @Test
    void calculateDoubleProduct() {
        calculator.turnOn();
        double result = calculator.multiply(1.1, 5.5);
        assertEquals(6.05, result, .0001);
    }

    @Test
    void calculateFloatProduct() {
        calculator.turnOn();
        float result = calculator.multiply(1.1f, 5.5f);
        assertEquals(6.05f, result, 0.0001);
    }

    @Test
    void calculateIntegerQuotient() {
        calculator.turnOn();
        int result = calculator.divide(30, 5);
        assertEquals(6, result);
    }

    @Test
    void calculateLongQuotient() {
        calculator.turnOn();
        int result = calculator.divide(670592745, 54321);
        assertEquals(12345, result);
    }

    @Test
    void calculateShortQuotient() {
        calculator.turnOn();
        int result = calculator.divide(56088, 456);
        assertEquals(123, result);
    }

    @Test
    void calculateDoubleQuotient() {
        calculator.turnOn();
        double result = calculator.divide(6.05, 5.5);
        assertEquals(1.1, result, .0001);
    }

    @Test
    void calculateFloatQuotient() {
        calculator.turnOn();
        float result = calculator.divide(6.05f, 5.5f);
        assertEquals(1.1f, result, 0.0001);
    }

    @Test
    void calculateIntUndefinedQuotient() {
        calculator.turnOn();
        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(7, 0);
        });
    }

    @Test
    void calculateDoubleUndefinedQuotient() {
        calculator.turnOn();
        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(8.12, 0);
        });
    }

    @Test
    void calculateFloatUndefinedQuotient() {
        calculator.turnOn();
        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(7.23, 0);
        });
    }

    @Test
    void calculateLongUndefinedQuotient() {
        calculator.turnOn();
        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(231231237, 0);
        });
    }

    @Test
    void calculateShortUndefinedQuotient() {
        calculator.turnOn();
        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(723, 0);
        });
    }

}