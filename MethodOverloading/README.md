# Method Overloading
https://beginnersbook.com/2013/05/method-overloading/ <br>
Schopnosť javy ktorá umožňuje **triede** mať viacej ako jednu metódu s rovnakým meno, 
jediné čo sa musí **líšiť** je zoznam argumentov.<br>
Sú tri spôsoby ako využiť overload metódy:<br>
1. počet parametrov 
```java
metoda(int a)
metoda(int a, int b)
metoda(int a, int b, int c)
```
2. dátové typy parametrov
```java
metoda(int a)
metoda(double a)
```

3. poradie dátových parametrov
```java
metoda(int a, float b)
metoda(float a, int b)
```
