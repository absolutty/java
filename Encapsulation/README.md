# Encapsulation 
https://www.tutorialspoint.com/java/java_encapsulation.htm <br>
Jeden zo základných konceptov OOP. Je to mechanizmus **obaľovania** (wrapping) dát (premenných, metód, tried, ..) 
a kódu ako jednotného celku. V enkapsulácií sú dáta jednej triedy skryté pre ostatné triedy. Dostať sa k nim 
je jedine možné pomocou metód danej triedy. <br>
![](https://github.com/absolutty/javaDocs/blob/master/Encapsulation/encapsulation-img.JPG)
- **vnútorný pohľad**: prístupný len objektu samému a jeho tvorcom
  - implementácia objektu(atribúty a metódy)
- **vonkajší pohľad**: prístupný všetkým čo objekt využívajú
  - rozhranie objektu
- objekt je braný ako celok
  - atribúty --> dátová časť
  - metódy --> správanie objektu
- "ostatní" môžu objekt len žiadať o vykonanie operácie
- objekt sa "sám rozhodne" spôsob spracovania
- **ukrývanie informácií**: ostatné objekty nemajú prístup k dátovej zložke objektu

Dosiahnutie enkapsulácie v Jave:
- deklarovanie premenných triedy ako **private**
- vytvorenie *public* **setter** a **getter** pre modifikovanie a vrátenie premenných
```java
class Trieda{
  //použitie keywordu private
  private int cislo;
  private String nazov;
  
  public Trieda(){
    cislo = 3;
    nazov = "Nový názov";
  }
  
  //vytvorenie settera
  public void setCislo(int cislo){
    //zmení na int použitú v metóde
    this.cislo = cislo;
  }
  public void setNazov(String nazov){
    //zmení na String použitú v metóde
    this.nazov = nazov;
  }
  
  //vytvorenie gettera
  public int getCislo(){
    return cislo;
  }
  public String getNazov(){
    return nazov;
  }
}
```
Výhody enkapsulácie:
- polia triedy môžu byť vytvorené na *read-only* alebo *write-only*
- trieda môže mať úplnú kontrolu nad tým čo ukladá do svojích polí
