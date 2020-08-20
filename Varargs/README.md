# Varargs
https://www.geeksforgeeks.org/variable-arguments-varargs-in-java/ <br>
S príchodom JDK 5 bola pridaná vymoženosť ktorá ujednoduchčovala vytváranie metód, ktoré majú za potrebné
brať n-počet argumentov. Skratka *varargs* znamená variable-length arguments. <br>
Schopnosť varargs môže byť použítá dvomi spôsobmi:
- použitím overload metód
- dávaním argumentov do array-u, ktorý je následne použitý v metóde. 

Syntax:
```java
private static double scitajCisla(double... zoznamCisel){
        int sucet = 0;

        for(double cislo: zoznamCisel){
            sucet += cislo;
        }
        return sucet;
    }
```
Na základe tohto syntaxu je povedané kompileru že metóda *scitajCisla* môže byť zavolaná 
s nula alebo viacerými argumentami. Vznikne z tohto array zoznamCisle[] typu double. <br>

Errory ktoré môžu vzniknúť:
- ak špecifikujeme dva *varargs* v jednej metóde
```java
void method(String... gfg, int... q)
{
    //compile time error
}
```
- ak nešpecifikujeme varargs ako posledný parameter v metóde
```java
void method(int... gfg, String q)
{
    //compile time error
}
```
