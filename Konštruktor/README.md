# Konštruktor 
https://docs.oracle.com/javase/tutorial/java/javaOO/constructors.html <br>
https://www.w3schools.com/java/java_constructors.asp <br>
https://www.javatpoint.com/java-constructor <br>
Špeciálna metóda obsianutá v triede slúži na vytvorenie jej blueprintu. Je zavolaná vtedy, keď sa objekt vytvára (keď je použitý keyword *new*). Môže nastavovať pridelené alebo 
predom nastavené hodnoty, ktoré sú následne súčasťou triedy. <br>
![](https://github.com/absolutty/javaDocs/blob/master/Kon%C5%A1truktor/konstruktor-kompilator.png)
Trieda môže ale nemusí obsahovať constructor. 
Pokiaľ nie je vytvorený, inštancie obsiahnuté v triede sú nastavené na defaultne hodnoty.
```java
//defaultny konštruktor, tzv. non-args konštruktor
int cislo;
String meno;

public Trieda(){
  this.cislo = 0;
  this.meno = null;
} 

//definovaný konštruktor, tzv. parameterized konštruktor
int cislo;
String meno;

public Trieda(int cislo, String meno){
  this.cislo = cislo; 
  this.meno = meno;
}
```

Použitie konštruktor:
```java
Trieda mojaTrieda = new Trieda(3, "nazov"); 
// new Trieda(3, "nazov") vyčlení pamäť pre objekt a inicializije jeho hodnoty
```
**Pravidlá konštruktor:**
- musí mať rovnaký názov ako je názov triedy
- nemá **return** type
- nemôže byť *abstract*, *static*, *final*, a *synchronized* 

**Konštruktor overloading:**
```java
String nazov;
int pocet;

public Triead(String nazov){
  this.nazov = nazov;
}

public Triead(int pocet){
  this.pocet = pocet;
}

public Triead(String nazov, int pocet){
  this.nazov = nazov;
  this.pocet = pocet;
}
```
**Kopírovanie pomocou konštruktora:**
```java
//konštruktor ktorý vytvorí nový objekt na základe skopírovaných údajov jedného
public Trieda(Trieda t){
  this.nazov = t.nazov;
  this.pocet = t.pocet;
}
```
