package org.example;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        System.out.println("=== Calculatrice Simple ===");
        
        // Exemples d'utilisation
        double a = 10.0;
        double b = 3.0;
        
        System.out.println("Addition: " + a + " + " + b + " = " + calculator.add(a, b));
        System.out.println("Soustraction: " + a + " - " + b + " = " + calculator.subtract(a, b));
        System.out.println("Multiplication: " + a + " * " + b + " = " + calculator.multiply(a, b));
        System.out.println("Division: " + a + " / " + b + " = " + calculator.divide(a, b));
    }
}