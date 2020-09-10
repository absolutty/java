# Interface
https://www.w3schools.com/java/java_interface.asp <br>
Jedná sa o *kompletne abstraktnú* triedu, ktorá slúži na zgroupovanie metód s prázdnym telom. 
```java
// interface
interface Animal {
  public void animalSound(); 
  public void run(); 
}
```
Pre prístup k metódam obsiahnutých v interface-i, musí byť *implemented*(implementovaný) inou triedou
použitím keywordu **implements**. Telo interface-u je vytvorené v implementovanej triede.
```java
class Pig implements Animal {
  public void animalSound() {
    System.out.println("Prasiastko zvuk"); //telo metódy je vytvorené TU
  }
  public void sleep() {
    System.out.println("Zzz"); //telo metódy je vytvorené TU
  }
}
```
**Interface:**
- tak isto ako abstraktné triedy, nemôže byť použitý na tvorbu objektov.
- jeho metódy nemajú telo --> to je vytvárané v implementovanej triede
- jeho *metódy* sú defaultne **abstract** a **public**
- jeho *atribúty* sú defaultne **public**, **static** a **final**
- pri implementácií interafe-u sa **musia override-núť všetky** metódy obsiahnuté v interface-i
- nemôže obsahovať constructor --> pretože nemôže vytvárať objekty

**Použitie**:
- **dosiahnutie bezpečnosti**: skrýva niektoré detaily a zobrazuje iba tie potrebné detaily objektu
- **java nepodporuje multiple inheritance**: trieda môže dediť iba z jej superclass. Ale dedičnosť 
z niekoľkých tried môže byť docielená implementovaním niekoľkých interface-ov.
```java
class Trieda implements PrvyInterface, DruhyInterface{
...
}
```
