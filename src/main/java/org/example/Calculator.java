package org.example;

/**
 * Classe Calculator fournissant les 4 opérations arithmétiques principales
 */
public class Calculator {
    
    /**
     * Additionne deux nombres
     * @param a premier nombre
     * @param b deuxième nombre
     * @return la somme de a et b
     */
    public double add(double a, double b) {
        return a + b;
    }
    
    /**
     * Soustrait b de a
     * @param a premier nombre
     * @param b deuxième nombre
     * @return la différence de a et b
     */
    public double subtract(double a, double b) {
        return a - b;
    }
    
    /**
     * Multiplie deux nombres
     * @param a premier nombre
     * @param b deuxième nombre
     * @return le produit de a et b
     */
    public double multiply(double a, double b) {
        return a * b;
    }
    
    /**
     * Divise a par b
     * @param a dividende
     * @param b diviseur
     * @return le quotient de a et b
     * @throws ArithmeticException si b est égal à 0
     */
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division par zéro impossible");
        }
        return a / b;
    }
}
