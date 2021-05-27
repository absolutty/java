# hashCode()

https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html#hashCode() 
- vráti hash hodnotu objektu
- používa sa pri zoskupeniach, u ktorých nechceme duplikované inštancie objektov
- vždy keď je táto metóda vyvolaná na rovnaké objekty počas spustenia Java aplikácie, musí vrátiť tú istú hodnotu
![](https://github.com/absolutty/javaDocs/blob/master/hashCode/hashcode-vysvetlenie.jpg)
- ak sú dva objekty rovné /na základe metódy equals()/, majú rovnakú *int* hodnotu
- unikátnosť hash čísla sa dosiahne pomocou metód **equals()** a **hashcode()**

```java
    //dve osoby s rovnakým menom, sú identické (len jedna z nich je pridaná do HashSet-u
    private static final int HASH_KONSTANTA = 57; 
    @Override
    public int hashCode() {
        return this.meno.hashCode() * Osoba.HASH_KONSTANTA; //hashcode mena je prenásobený random konštantou HASH_KONSTANTA
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) { //ak sa jedna o rovnaku instanciu
            return true;
        } else if (obj instanceof Osoba) {
            Osoba os = (Osoba)obj;
            return os.getMeno().equals(this.meno);
        }
        return false; //nebola splnena ani jedna z uvedenych podmienok
    }
```

```java
     //duplikovane hodnoty (určené metódou equals() a hashcode(): majú rovnaké meno)
     Osoba o1 = new Osoba("Matej", 25);
     Osoba o2 = new Osoba("Matej", 23);
```
