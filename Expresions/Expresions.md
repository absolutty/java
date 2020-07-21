# Expresions
https://docs.oracle.com/javase/tutorial/java/nutsandbolts/expressions.html <br>
Jedná sa o súhrn premenných, operátorov a volaní metód, ktorých výsledok je jedna hodnota. Sú zostavené podľa
konkretneho jazyka. Dátový typ návratovej hodnoty závisí od použitého elementu. 
```java
int intCislo = 0; //návratová hodnota typu int 
double doubleCislo = 2.1+1.1; //návratová hodnota typu double, výsledok 3.2

int prve = 1, druhe = 2;

if(prve == druhe){//boolean ktorý sa rovná true, ak prvé a druhé cislo majú rovnakú hodnotu
  //vykoná blok kódu
}
```

Java umožňuje tvorbu zložených výrazov z niekoľkých menších
```java
1*2 + 2*3 + 3*4
```

Ak nie je určené poradie vykonávaných operácií, vykonávané budú na základe ich prednosti 
(v prípade že majú rovnakú váhu, vykonávané sú z ľava do prava)
```java
2+3 / 100 //výsledok nie je 0.5, delenie je vykonané skôr
```

Poradie vykonaných úkonov môže byť špecifikované pridaním zátvoriek. 
```java
(2+3) / 100 //výsledok je 0.5
```
