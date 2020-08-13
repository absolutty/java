# Bank
Trieda *Bank.java* vytvára "banku", Banka obsahuje zoznam jej pobociek s názvom. Pobocka obsahuje zoznam zákazníkov s ich menom, priezviskom a zostatkom na účte. <br>
Program je spustený automaticky, pri vytváraní konštruktora a obsahuje jednoduchú navigáciu v príkazovom riadku. <br>
Taktiež v konštruktory zadefinované *defaultne* pobočky, ktoré majú preddefinovaných zákazníkov. 
```java
//defaultne vytvorené pobocky aj so zákazníkmi
Pobocka pobockaPrievidza = Pobocka.vytvor("Prievidza");
Pobocka pobockaHandlova = Pobocka.vytvor("Handlová");

pobockaPrievidza.pridajZakaznika(Zakaznik.vytvor("Adam", "Prievidžan", 500));
pobockaPrievidza.pridajZakaznika(Zakaznik.vytvor("Peter", "Zprievidze", 200));

pobockaHandlova.pridajZakaznika(Zakaznik.vytvor("Jano", "Handlovčan", 1200));
pobockaHandlova.pridajZakaznika(Zakaznik.vytvor("Samuel", "Zhandlovej", 320));
pobockaHandlova.pridajZakaznika(Zakaznik.vytvor("Marek", "Handlová", 299));

this.arrPobocky.add(pobockaPrievidza);
this.arrPobocky.add(pobockaHandlova);
```
