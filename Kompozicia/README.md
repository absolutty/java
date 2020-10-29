# Composition
https://www.journaldev.com/1325/composition-in-java-example <br>
Dizajnová technika, využíva **has-a** (má niečo, niekoho, ...) relation. Umožňuje vytvárať *objekty* **tvorené** *objektami*
```java
public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }
}    
```
**Výhody**: <br>
- class PC nie je ovplyvnená žiadnými zmenami v objektoc Case, Monitor a Motherboard
- vzťah *has-a* umožňuje znovu-použitie kódu --> je vhodný pre použitie vo viacerých triedach
- môžeme kontrolovať viditeľnosť objektov v triede

