# Inheritance
https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html <br>
Dedičnosť v Jave znamená že triedy (*subclass*) môžu byť odvodené od tried (*superclass*). Dá sa to dosiahnúť pomocou keyword **extends**.
Využíva **is-a** (je niečo, niekto, ...) relation.
```java
class Trieda{}

class Podtrieda extends Trieda{}
```
Zdedí všetkých public a protected členov (*inštancie*, *metódy*, *inner triedy*, atď...), nezáležiac od packageu. Pokiaľ package je rovnaký, dedia sa aj polia ktoré sú *package-private*.
Zdedené členy sa môžu použiť, skryť, nahradiť alebo môžu byť pridané nové. <br>
Constructor sa **nededí**, ale je ho možné invokovať.
 ```java
 //superclass
 class Auto{
    String typ;
    int pocetKolies;
    int pocetDveri;
  
    public Auto(String typ, int pocetKolies, int pocetDveri){
        this.typ = typ;
        this.pocetKolies = pocetKolies;
        this.pocetDveri = pocetDveri;
    }
    
    public String getTyp(){
        return this.typ;
    }
 }
 
 //subclass
 class OsobneAuto extends Auto{
    String typOsobnehoAuta;
    
    public OsobneAuto(String typOsobnehoAuta, int pocetDveri){
        super("osobné auto", 4, pocetDveri);
        this.typOsobnehoAuta = typOsobnehoAuta;
    }
 }
 ```
- zdedené polia môžu byť použité priamo, tak isto aj ostatné členy
 ```java
 OsobneAuto.pocetKolies; //počet kolies osobného auta z super class
 ```
 - v subclasse môžu byť deklarované polia s rovnakým názvom a druhom parametrov ako má parentclass, týmto sa prepíšu (*override*)
 - môžu sa deklarovať nové polia a metódy, ktoré nie sú v parentclasse
 - zdedené metódy môžu byť použité priamo tak ako sú
 ```java
 OsobneAuto.getTyp; //metóda definovaná v parentclasse
 ```
 
 
