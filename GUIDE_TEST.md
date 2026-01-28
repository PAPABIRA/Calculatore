# Guide de Test de la Calculatrice

## Méthode 1 : Via IntelliJ IDEA (Recommandé)

### Exécuter tous les tests :
1. Ouvrez le fichier `CalculatorTest.java` dans IntelliJ IDEA
2. Cliquez avec le bouton droit sur la classe `CalculatorTest` ou sur le nom de la classe
3. Sélectionnez **"Run 'CalculatorTest'"** ou utilisez le raccourci `Ctrl+Shift+F10`
4. Tous les tests seront exécutés et vous verrez les résultats dans la fenêtre "Run"

### Exécuter un test spécifique :
1. Cliquez avec le bouton droit sur une méthode de test (par exemple `testAdd()`)
2. Sélectionnez **"Run 'testAdd()'"**
3. Seul ce test sera exécuté

### Exécuter le programme principal :
1. Ouvrez `Main.java`
2. Cliquez avec le bouton droit et sélectionnez **"Run 'Main.main()'"**
3. Vous verrez des exemples d'utilisation de la calculatrice dans la console

## Méthode 2 : Via Maven (ligne de commande)

Si Maven est installé et configuré dans votre PATH :

```bash
# Exécuter tous les tests
mvn test

# Exécuter avec affichage détaillé
mvn test -X

# Compiler et tester
mvn clean test
```

## Méthode 3 : Via Gradle (si vous utilisez Gradle)

```bash
./gradlew test
```

## Résultats attendus

Tous les tests devraient passer avec succès :
- ✅ `testAdd()` - 4 assertions
- ✅ `testSubtract()` - 4 assertions  
- ✅ `testMultiply()` - 4 assertions
- ✅ `testDivide()` - 5 assertions (incluant le test d'exception)

**Total : 17 assertions qui devraient toutes réussir**

## Tests inclus

### Test d'Addition (`testAdd`)
- Nombres positifs : 2 + 3 = 5
- Avec nombre négatif : 2 + (-3) = -1
- Avec zéro : 5 + 0 = 5
- Nombres décimaux : 1.2 + 2.3 = 3.5

### Test de Soustraction (`testSubtract`)
- Nombres positifs : 5 - 3 = 2
- Avec nombre négatif : 2 - (-3) = 5
- Avec zéro : 5 - 0 = 5
- Nombres décimaux : 1.2 - 2.3 = -1.1

### Test de Multiplication (`testMultiply`)
- Nombres positifs : 5 × 3 = 15
- Avec nombre négatif : 2 × (-3) = -6
- Avec zéro : 5 × 0 = 0
- Nombres décimaux : 1.2 × 2.3 = 2.76

### Test de Division (`testDivide`)
- Nombres positifs : 6 ÷ 3 = 2
- Avec nombre négatif : 6 ÷ (-3) = -2
- Nombres décimaux : 5 ÷ 2 = 2.5
- **Test d'exception** : Division par zéro doit lever `ArithmeticException`
- Résultat décimal : 1 ÷ 2 = 0.5
