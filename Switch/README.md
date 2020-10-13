# Príkaz switch
- jedná sa o viaccestné vetvenie
- výraz na kontrolu musí byť celočíselný alebo reťazec(od verzie Java 6)
- overuje niekoľko možnosti vetvy --> **case**
- ak chceme príkaz ukončiť, musí byť použitý keyword **break** na konci danej vetvy
- ak nie, pokračuje to overovaním ďaľších možností
- pokiaľ výraz nie je nájdený, vykoná sa predvolená vetva **default**
```java
switch(výraz){
  case moznost1:
    //ak je moznost1 nájdená
    break;
  case moznost2: 
    //ak je moznost2 nájdená
    break;
  default:
    //ak nie je nájdená ani jedna z možností
    break;
}
```

