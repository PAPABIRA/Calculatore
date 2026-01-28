package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests unitaires pour la classe Calculator
 */
class CalculatorTest {
    
    private Calculator calculator;
    
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }
    
    @Test
    void testAdd() {
        // Test avec des nombres positifs
        assertEquals(5.0, calculator.add(2.0, 3.0), 0.001);
        
        // Test avec un nombre négatif
        assertEquals(-1.0, calculator.add(2.0, -3.0), 0.001);
        
        // Test avec zéro
        assertEquals(5.0, calculator.add(5.0, 0.0), 0.001);
        
        // Test avec des nombres décimaux
        assertEquals(3.5, calculator.add(1.2, 2.3), 0.001);
    }
    
    @Test
    void testSubtract() {
        // Test avec des nombres positifs
        assertEquals(2.0, calculator.subtract(5.0, 3.0), 0.001);
        
        // Test avec un nombre négatif
        assertEquals(5.0, calculator.subtract(2.0, -3.0), 0.001);
        
        // Test avec zéro
        assertEquals(5.0, calculator.subtract(5.0, 0.0), 0.001);
        
        // Test avec des nombres décimaux
        assertEquals(-1.1, calculator.subtract(1.2, 2.3), 0.001);
    }
    
    @Test
    void testMultiply() {
        // Test avec des nombres positifs
        assertEquals(15.0, calculator.multiply(5.0, 3.0), 0.001);
        
        // Test avec un nombre négatif
        assertEquals(-6.0, calculator.multiply(2.0, -3.0), 0.001);
        
        // Test avec zéro
        assertEquals(0.0, calculator.multiply(5.0, 0.0), 0.001);
        
        // Test avec des nombres décimaux
        assertEquals(2.76, calculator.multiply(1.2, 2.3), 0.001);
    }
    
    @Test
    void testDivide() {
        // Test avec des nombres positifs
        assertEquals(2.0, calculator.divide(6.0, 3.0), 0.001);
        
        // Test avec un nombre négatif
        assertEquals(-2.0, calculator.divide(6.0, -3.0), 0.001);
        
        // Test avec des nombres décimaux
        assertEquals(2.5, calculator.divide(5.0, 2.0), 0.001);
        
        // Test de division par zéro
        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(5.0, 0.0);
        });
        
        // Test avec un résultat décimal
        assertEquals(0.5, calculator.divide(1.0, 2.0), 0.001);
    }
}
