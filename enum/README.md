# enum
https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html <br>
- špecialný dátový typ(podobné ako pri použití final)
- umožňuje nastaviť premenné na **predom definované** hodnoty
- píšu sa v upper-case 
- použitie napríklad: dni v týždni(PONDELOK, UTOROK, STREDA, ...), svetové strany(SEVER, JUH, ZÁPAD, VÝCHOD), ...
```java
public enum SvetoveStrany {
  SEVER, JUH, ZÁPAD, VÝCHOD 
}
```
- enum typy majú byť použité vtedy, keď je potrebné reprezentovať predom nastavené a fixné konštanty
- príklad použitia:
```java
  SvetoveStrany strana = SvetoveStrany.JUH;
  
  switch(strana){
    case SEVER:
      System.out.println("Smeruješ na sever, do zimy");
      break; 
    case JUH:
      System.out.println("Smeruješ na juh, do tepla");
      break;
    case ZÁPAD: 
      System.out.println("Smeruješ na západ, do Ameriky");
      break;
    case: VÝCHOD:
      System.out.println("Smeruješ na východ, do Ruska");
      break;
  }
```
- je možné aj vytvorenie **konštruktora**
- konštruktor musí byť *package-private* ale bo *private*
- automaticky vytvorí konštanty, kt. sú definované v tele enum-u
- nie je možné ho vyvolať z vonku (mimo samotnej triedy)
```java
public enum MatematickeHodnoty {
    PI(3.14),
    e(2.17),
    hmotnostTvojaMama(Integer.MAX_VALUE);

    private double hodnota;

    MatematickeHodnoty(double hodnota) {
        this.hodnota = hodnota;
    }

    public double getHodnota() {
        return hodnota;
    }
}
```
