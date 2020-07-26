# Constructor 
https://docs.oracle.com/javase/tutorial/java/javaOO/constructors.html <br>
Constructor obsianutý v triede slúži na vytvorenie jej blueprintu. Môže nastavovať pridelené alebo 
predom nastavené hodnoty, ktoré sú následne súčasťou triedy. Trieda môže ale nemusí obsahovať constructor. 
Pokiaľ nie je vytvorený, inštancie obsiahnuté v triede sú nastavené na defaultne hodnoty.
```java
//defaultny constructor
int cislo;
String meno;

public Trieda(){
  this.cislo = 0;
  this.meno = null;
} 

//definovaný constructor
int cislo;
String meno;

public Trieda(int cislo, String meno){
  this.cislo = cislo; 
  this.meno = meno;
}
```

Použitie constructora:
```java
Trieda mojaTrieda = new Trieda(3, "nazov"); 
// new Trieda(3, "nazov") vyčlení pamäť pre objekt a inicializije jeho hodnoty
```
